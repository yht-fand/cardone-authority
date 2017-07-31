package top.cardone.api.vx.authority.oAuthConsumer

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.OAuthConsumerService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0001 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.clientSecret = input?.clientSecret
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.oauthConsumerId = input?.oauthConsumerId
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.oAuthConsumerCode)) {
//          throw new CodeException("oAuthConsumerCode required", "授权消费编号必填")
//      }
//
//      if (StringUtils.length(input?.oAuthConsumerCode) < 4) {
//          throw new CodeException("oAuthConsumerCode minlength", "授权消费编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.oAuthConsumerCode) > 255) {
//          throw new CodeException("oAuthConsumerCode maxlength", "授权消费编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "授权消费名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "授权消费名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "授权消费名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['oAuthConsumerCode': input.oAuthConsumerCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(OAuthConsumerService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("oAuthConsumerCode already exists", "授权消费编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(OAuthConsumerService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}