package api.vx.authority.tokenInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.TokenInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def tokenInfoIds = input?.tokenInfoIds?.split(",")

        if (!tokenInfoIds) {
            throw new CodeException("tokenInfoIds required", "令牌信息标识集合必填")
        }

        def tokenInfoIdList = []

        for (def tokenInfoId : tokenInfoIds) {
            tokenInfoIdList.add(["tokenInfoId": tokenInfoId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["tokenInfoIds": tokenInfoIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(TokenInfoService.class).updateListCache(input?.tokenInfoIds)]
    }

    def output(output) {
        output
    }
}