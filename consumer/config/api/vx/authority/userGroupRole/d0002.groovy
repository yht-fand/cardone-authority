package api.vx.authority.userGroupRole

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupRoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def userGroupRoleIds = input?.userGroupRoleIds?.split(",")

        if (!userGroupRoleIds) {
            throw new CodeException("userGroupRoleIds required", "用户组与角色标识集合必填")
        }

        def userGroupRoleIdList = []

        for (def userGroupRoleId : userGroupRoleIds) {
            userGroupRoleIdList.add(["userGroupRoleId": userGroupRoleId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["userGroupRoleIds": userGroupRoleIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(UserGroupRoleService.class).deleteListCache(input?.userGroupRoleIds)]
    }

    def output(output) {
        output
    }
}