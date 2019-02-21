package top.cardone.api.vx.authority.permissionMapper

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionMapperService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class r0002 implements java.io.Serializable {
    def input(input) {
        input
    }

    def validation(input) {
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionMapperService.class).findListByKeyword(input)
    }

    def output(output) {
        def newOutput = []
		
        for (def outputItem : output) {
			newOutput.add(['label': outputItem['name'], 'value': outputItem['C1_PERMISSION_MAPPER_code']])
        }

        newOutput
    }
}