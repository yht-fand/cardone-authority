package top.cardone.api.vx.authority.tokenInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.TokenInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class r0002 implements java.io.Serializable {
    def input(input) {
        input
    }

    def validation(input) {
    }

    def func(input) {
		ApplicationContextHolder.getBean(TokenInfoService.class).findListByKeyword(input)
    }

    def output(output) {
        def newOutput = []
		
        for (def outputItem : output) {
			newOutput.add(['label': outputItem['name'], 'value': outputItem['C1_TOKEN_INFO_code']])
        }

        newOutput
    }
}