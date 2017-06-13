package api.vx.authority.rolePermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RolePermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def rolePermissionIds = input?.rolePermissionIds?.split(",")

        if (!rolePermissionIds) {
            throw new CodeException("rolePermissionIds required", "角色与许可标识集合必填")
        }

        def rolePermissionIdList = []

        for (def rolePermissionId : rolePermissionIds) {
            rolePermissionIdList.add(["rolePermissionId": rolePermissionId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["rolePermissionIds": rolePermissionIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(RolePermissionService.class).deleteListCache(input?.rolePermissionIds)]
    }

    def output(output) {
        output
    }
}