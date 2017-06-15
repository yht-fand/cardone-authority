package top.cardone.api.vx.authority.tokenInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.TokenInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0002 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.clientId = input?.clientId
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.scope = input?.scope
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.tokenInfoCode = input?.tokenInfoCode
		newInput?.tokenInfoId = input?.tokenInfoId
		newInput?.userCode = input?.userCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.tokenInfoId)) {
//          throw new CodeException("tokenInfoId required", "令牌信息标识必填")
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

		def readOne = ["tokenInfoCode": input.tokenInfoCode, "object_id": "tokenInfoId", "dataStateCode": "1"]

		String dbTokenInfoId = ApplicationContextHolder.getBean(TokenInfoService.class).readOne(String.class, readOne)

		if ((dbTokenInfoId != null) && !StringUtils.equals(dbTokenInfoId, input.tokenInfoId)) {
			throw new CodeException("tokenInfoId already exists", "令牌信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(TokenInfoService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}