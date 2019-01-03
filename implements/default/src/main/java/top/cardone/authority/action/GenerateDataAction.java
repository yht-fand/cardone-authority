package top.cardone.authority.action;

import lombok.extern.log4j.Log4j2;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.action.Action0;

import java.util.UUID;

@Log4j2
public class GenerateDataAction implements Action0 {
    private int runNum = 0;

    @Override
    public void action() {
        if (runNum > 0) {
            runNum++;

            return;
        }

        runNum++;

        while (runNum > 0) {
            String flagObjectCode = UUID.randomUUID().toString();

            try {
                ApplicationContextHolder.getBean(UserGroupService.class).generateData(flagObjectCode);

                //用户组与用户
                ApplicationContextHolder.getBean(UserGroupUserService.class).generateData(flagObjectCode);

                //角色
                ApplicationContextHolder.getBean(RoleService.class).generateData(flagObjectCode);

                //用户组与角色
                ApplicationContextHolder.getBean(UserGroupRoleService.class).generateData(flagObjectCode);

                //用户与角色
                ApplicationContextHolder.getBean(UserRoleService.class).generateData(flagObjectCode);

                ApplicationContextHolder.getBean(UserRoleService.class).executeQueryBySqlFileName("readListUserCode", null, String.class, userCode -> {
                    ApplicationContextHolder.getBean(UserRoleService.class).generateData(flagObjectCode, null, userCode);
                });

                //授权
                ApplicationContextHolder.getBean(PermissionService.class).generateData(flagObjectCode);

                //角色与授权
                ApplicationContextHolder.getBean(RolePermissionService.class).generateData(flagObjectCode);

                //用户组与授权
                ApplicationContextHolder.getBean(UserGroupPermissionService.class).generateData(flagObjectCode);

                //用户与授权
                ApplicationContextHolder.getBean(UserPermissionService.class).generateData(flagObjectCode);

                ApplicationContextHolder.getBean(UserPermissionService.class).executeQueryBySqlFileName("readListUserCode", null, String.class, userCode -> {
                    ApplicationContextHolder.getBean(UserPermissionService.class).generateData(flagObjectCode, null, userCode);
                });

                Thread.sleep(3000);
            } catch (InterruptedException e) {
                log.error(e);
            } finally {
                runNum--;
            }
        }
    }
}
