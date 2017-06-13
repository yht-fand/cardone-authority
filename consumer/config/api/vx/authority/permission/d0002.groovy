package api.vx.authority.permission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def permissionIds = input?.permissionIds?.split(",")

        if (!permissionIds) {
            throw new CodeException("permissionIds required", "许可标识集合必填")
        }

        def permissionIdList = []

        for (def permissionId : permissionIds) {
            permissionIdList.add(["permissionId": permissionId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["permissionIds": permissionIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(PermissionService.class).deleteListCache(input?.permissionIds)]
    }

    def output(output) {
        output
    }
}