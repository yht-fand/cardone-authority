package top.cardone.api.vx.authority.permissionMapper

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionMapperService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def permissionMapperIds = input?.permissionMapperIds?.split(",")

        if (!permissionMapperIds) {
            throw new CodeException("permissionMapperIds required", "许可映射标识集合必填")
        }

        def permissionMapperIdList = []

        for (def permissionMapperId : permissionMapperIds) {
            permissionMapperIdList.add(["permissionMapperId": permissionMapperId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["permissionMapperIds": permissionMapperIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(PermissionMapperService.class).updateListCache(input?.permissionMapperIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}