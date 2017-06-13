package api.vx.authority.oAuthConsumer

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.OAuthConsumerService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def oAuthConsumerIds = input?.oAuthConsumerIds?.split(",")

        if (!oAuthConsumerIds) {
            throw new CodeException("oAuthConsumerIds required", "授权消费标识集合必填")
        }

        def oAuthConsumerIdList = []

        for (def oAuthConsumerId : oAuthConsumerIds) {
            oAuthConsumerIdList.add(["oAuthConsumerId": oAuthConsumerId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["oAuthConsumerIds": oAuthConsumerIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(OAuthConsumerService.class).updateListCache(input?.oAuthConsumerIds)]
    }

    def output(output) {
        output
    }
}