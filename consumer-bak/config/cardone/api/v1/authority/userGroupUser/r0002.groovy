package top.cardone.api.vx.authority.userGroupUser

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupUserService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class r0002 implements java.io.Serializable {
    def input(input) {
        input
    }

    def validation(input) {
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupUserService.class).findListByKeyword(input)
    }

    def output(output) {
        def newOutput = []
		
        for (def outputItem : output) {
			newOutput.add(['label': outputItem['name'], 'value': outputItem['C1_USER_GROUP_USER_code']])
        }

        newOutput
    }
}