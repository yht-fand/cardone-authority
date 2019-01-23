package top.cardone.authority.action

import com.google.common.collect.Lists
import org.apache.commons.collections.MapUtils
import com.google.common.collect.Sets
import top.cardone.authority.service.UserPermissionService
import top.cardone.authority.service.UserRoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.context.event.SimpleEvent
import top.cardone.core.util.action.Action1
import top.cardone.core.util.action.Action2

class ChageUserRoleAction implements Action1<SimpleEvent> {
    @Override
    void action(SimpleEvent simpleEvent) {
        Set<String> userCodes = Sets.newHashSet()

        if (top.cardone.context.util.StringUtils.matchs(Lists.newArrayList("insertList*Cache", "saveList*Cache", "updateList*Cache"), simpleEvent.getFlags()[1])) {
            def datas = simpleEvent.args[simpleEvent.args.length - 1]

            if (!(datas instanceof List)) {
                return
            }

            for (def data : datas) {
                if (!(data instanceof Map)) {
                    return
                }

                addUserCodes(data, userCodes)
            }
        } else if (top.cardone.context.util.StringUtils.matchs(Lists.newArrayList("insert*Cache", "save*Cache", "update*Cache"), simpleEvent.getFlags()[1])) {
            def data = simpleEvent.args[simpleEvent.args.length - 1]

            if (!(data instanceof Map)) {
                return
            }

            addUserCodes(data, userCodes)
        }

        this.generateData(userCodes)
    }

    private void addUserCodes(Map data, HashSet<String> userCodes) {
        String userCode = MapUtils.getString(data, "userCode")

        if (userCode) {
            userCodes.add(userCode)
        }
    }

    void generateData(Set<String> userCodes) {
        if (!userCodes) {
            return
        }

        for (String userCode : userCodes) {
            ApplicationContextHolder.getBean(UserPermissionService.class).generateDataByUserCode(userCode)

            ApplicationContextHolder.getBean(Action2.class, "top/cardone/usercenter/action/EvictUserCacheAction").action(userCode, Lists.newArrayList())

            Thread.sleep(3000)
        }
    }
}