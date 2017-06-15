package api.vx.authority.userGroupPermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupPermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def userGroupPermissionIds = input?.userGroupPermissionIds?.split(",")

        if (!userGroupPermissionIds) {
            throw new CodeException("userGroupPermissionIds required", "用户组与许可标识集合必填")
        }

        def userGroupPermissionIdList = []

        for (def userGroupPermissionId : userGroupPermissionIds) {
            userGroupPermissionIdList.add(["userGroupPermissionId": userGroupPermissionId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["userGroupPermissionIds": userGroupPermissionIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(UserGroupPermissionService.class).deleteListCache(input?.userGroupPermissionIds)]
    }

    def output(output) {
        output
    }
}