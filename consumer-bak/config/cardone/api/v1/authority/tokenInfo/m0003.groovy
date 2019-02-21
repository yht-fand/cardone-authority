package top.cardone.api.vx.authority.tokenInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.TokenInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0003 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.clientId = input?.clientId
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
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.scope = input?.scope
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.tokenInfoCode = input?.tokenInfoCode
		newInput?.tokenInfoId = input?.tokenInfoId
		newInput?.userCode = input?.userCode
		newInput?.userId = input?.userId
		newInput?.version = input?.version

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
		
		def readOne = ['tokenInfoCode': input.tokenInfoCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(TokenInfoService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("tokenInfoCode already exists", "令牌信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(TokenInfoService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.BATCH_NO
		newOutput?.beginDate = output?.BEGIN_DATE
		newOutput?.clientId = output?.CLIENT_ID
		newOutput?.createdByCode = output?.CREATED_BY_CODE
		newOutput?.createdById = output?.CREATED_BY_ID
		newOutput?.createdDate = output?.CREATED_DATE
		newOutput?.dataStateCode = output?.DATA_STATE_CODE
		newOutput?.departmentCode = output?.DEPARTMENT_CODE
		newOutput?.endDate = output?.END_DATE
		newOutput?.flagCode = output?.FLAG_CODE
		newOutput?.flagObjectCode = output?.FLAG_OBJECT_CODE
		newOutput?.jsonData = output?.JSON_DATA
		newOutput?.lastModifiedByCode = output?.LAST_MODIFIED_BY_CODE
		newOutput?.lastModifiedById = output?.LAST_MODIFIED_BY_ID
		newOutput?.lastModifiedDate = output?.LAST_MODIFIED_DATE
		newOutput?.orderBy = output?.ORDER_BY_
		newOutput?.orgCode = output?.ORG_CODE
		newOutput?.personalCode = output?.PERSONAL_CODE
		newOutput?.personalId = output?.PERSONAL_ID
		newOutput?.scope = output?.SCOPE
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.tokenInfoCode = output?.TOKEN_INFO_CODE
		newOutput?.tokenInfoId = output?.TOKEN_INFO_ID
		newOutput?.userCode = output?.USER_CODE
		newOutput?.userId = output?.USER_ID
		newOutput?.version = output?.VERSION_

        newOutput
    }
}