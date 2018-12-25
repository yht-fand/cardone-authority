package top.cardone.api.vx.authority.oauthConsumer

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.OauthConsumerService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0004 implements java.io.Serializable {
    def input(input) {
        def oauthConsumerIds = input?.oauthConsumerIds?.split(",")

        if (!oauthConsumerIds) {
            throw new CodeException("oauthConsumerIds required", "授权消费标识集合必填")
        }

        def oauthConsumerIdList = []

        for (def oauthConsumerId : oauthConsumerIds) {
            oauthConsumerIdList.add(["oauthConsumerId": oauthConsumerId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["oauthConsumerIds": oauthConsumerIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(OauthConsumerService.class).updateListCache(input?.oauthConsumerIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}