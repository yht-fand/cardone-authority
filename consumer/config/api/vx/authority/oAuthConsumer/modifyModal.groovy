package api.vx.authority.oAuthConsumer

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.OAuthConsumerService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal {
    def input(input) {
        ["oAuthConsumerId": input.oAuthConsumerId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.oAuthConsumerId)) {
//          throw new CodeException("oAuthConsumerId required", "授权消费标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(OAuthConsumerService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput['batchNo'] = output['batch_no']
		newOutput['beginDate'] = output['begin_date']
		newOutput['clientSecret'] = output['client_secret']
		newOutput['createdByCode'] = output['created_by_code']
		newOutput['createdDate'] = output['created_date']
		newOutput['dataStateCode'] = output['data_state_code']
		newOutput['departmentCode'] = output['department_code']
		newOutput['endDate'] = output['end_date']
		newOutput['flagCode'] = output['flag_code']
		newOutput['flagObjectCode'] = output['flag_object_code']
		newOutput['jsonData'] = output['json_data']
		newOutput['lastModifiedByCode'] = output['last_modified_by_code']
		newOutput['lastModifiedDate'] = output['last_modified_date']
		newOutput['oauthConsumerId'] = output['oauth_consumer_id']
		newOutput['orderBy'] = output['order_by_']
		newOutput['orgCode'] = output['org_code']
		newOutput['personalCode'] = output['personal_code']
		newOutput['siteCode'] = output['site_code']
		newOutput['stateCode'] = output['state_code']
		newOutput['systemInfoCode'] = output['system_info_code']
		newOutput['version'] = output['version_']

        newOutput
    }
}