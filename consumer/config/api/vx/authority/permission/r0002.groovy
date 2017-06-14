package api.vx.authority.permission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class r0002 implements java.io.Serializable {
    def input(input) {
        input
    }

    def validation(input) {
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionService.class).findListByKeyword(input)
    }

    def output(output) {
        def newOutput = []
		
        for (def outputItem : output) {
			newOutput.add(['label': outputItem['name'], 'value': outputItem['permission_code']])
        }

        newOutput
    }
}