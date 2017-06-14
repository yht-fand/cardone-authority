package api.vx.authority.userPermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserPermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def userPermissionIds = input?.userPermissionIds?.split(",")

        if (!userPermissionIds) {
            throw new CodeException("userPermissionIds required", "用户与许可标识集合必填")
        }

        def userPermissionIdList = []

        for (def userPermissionId : userPermissionIds) {
            userPermissionIdList.add(["userPermissionId": userPermissionId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["userPermissionIds": userPermissionIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(UserPermissionService.class).deleteListCache(input?.userPermissionIds)]
    }

    def output(output) {
        output
    }
}