package top.cardone.api.vx.authority.userRole

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserRoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def userRoleIds = input?.userRoleIds?.split(",")

        if (!userRoleIds) {
            throw new CodeException("userRoleIds required", "用户与角色标识集合必填")
        }

        def userRoleIdList = []

        for (def userRoleId : userRoleIds) {
            userRoleIdList.add(["userRoleId": userRoleId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["userRoleIds": userRoleIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(UserRoleService.class).updateListCache(input?.userRoleIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}