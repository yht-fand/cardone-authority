package top.cardone.api.vx.authority.userGroupRole

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupRoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0002 implements java.io.Serializable {
    def input(input) {
        def userGroupRoleIds = input?.userGroupRoleIds?.split(",")

        if (!userGroupRoleIds) {
            throw new CodeException("userGroupRoleIds required", "用户组与角色标识集合必填")
        }

        def userGroupRoleIdList = []

        for (def userGroupRoleId : userGroupRoleIds) {
            userGroupRoleIdList.add(["userGroupRoleId": userGroupRoleId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["userGroupRoleIds": userGroupRoleIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(UserGroupRoleService.class).updateListCache(input?.userGroupRoleIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}