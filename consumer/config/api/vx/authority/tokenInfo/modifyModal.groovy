package api.vx.authority.tokenInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.TokenInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["tokenInfoId": input.tokenInfoId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.tokenInfoId)) {
//          throw new CodeException("tokenInfoId required", "令牌信息标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(TokenInfoService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput['batchNo'] = output['batch_no']
		newOutput['beginDate'] = output['begin_date']
		newOutput['clientId'] = output['client_id']
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
		newOutput['orderBy'] = output['order_by_']
		newOutput['orgCode'] = output['org_code']
		newOutput['personalCode'] = output['personal_code']
		newOutput['scope'] = output['scope']
		newOutput['siteCode'] = output['site_code']
		newOutput['stateCode'] = output['state_code']
		newOutput['systemInfoCode'] = output['system_info_code']
		newOutput['tokenInfoCode'] = output['token_info_code']
		newOutput['tokenInfoId'] = output['token_info_id']
		newOutput['userCode'] = output['user_code']
		newOutput['version'] = output['version_']

        newOutput
    }
}