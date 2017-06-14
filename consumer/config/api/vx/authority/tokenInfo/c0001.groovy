package api.vx.authority.tokenInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.TokenInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0001 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['clientId'] = input['clientId']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['endDate'] = input['endDate']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['personalCode'] = input['personalCode']
		newInput['scope'] = input['scope']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['tokenInfoCode'] = input['tokenInfoCode']
		newInput['tokenInfoId'] = input['tokenInfoId']
		newInput['userCode'] = input['userCode']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.tokenInfoCode)) {
//          throw new CodeException("tokenInfoCode required", "令牌信息编号必填")
//      }
//
//      if (StringUtils.length(input?.tokenInfoCode) < 4) {
//          throw new CodeException("tokenInfoCode minlength", "令牌信息编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.tokenInfoCode) > 255) {
//          throw new CodeException("tokenInfoCode maxlength", "令牌信息编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "令牌信息名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "令牌信息名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "令牌信息名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['tokenInfoCode': input.tokenInfoCode]

		def count = ApplicationContextHolder.getBean(TokenInfoService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("tokenInfoCode already exists", "令牌信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(TokenInfoService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]
    }
}