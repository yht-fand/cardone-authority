package api.vx.authority.role

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def roleIds = input?.roleIds?.split(",")

        if (!roleIds) {
            throw new CodeException("roleIds required", "角色标识集合必填")
        }

        def roleIdList = []

        for (def roleId : roleIds) {
            roleIdList.add(["roleId": roleId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["roleIds": roleIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(RoleService.class).updateListCache(input?.roleIds)]
    }

    def output(output) {
        output
    }
}