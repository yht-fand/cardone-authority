package top.cardone.api.vx.authority.userGroupUser

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupUserService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0002 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
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
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.userCode = input?.userCode
		newInput?.userGroupCode = input?.userGroupCode
		newInput?.userGroupId = input?.userGroupId
		newInput?.userGroupUserId = input?.userGroupUserId
		newInput?.userId = input?.userId
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupUserCode)) {
//          throw new CodeException("userGroupUserCode required", "用户组与用户编号必填")
//      }
//
//      if (StringUtils.length(input?.userGroupUserCode) < 4) {
//          throw new CodeException("userGroupUserCode minlength", "用户组与用户编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.userGroupUserCode) > 255) {
//          throw new CodeException("userGroupUserCode maxlength", "用户组与用户编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户组与用户名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户组与用户名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户组与用户名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['userGroupUserCode': input.userGroupUserCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(UserGroupUserService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("userGroupUserCode already exists", "用户组与用户编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupUserService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.BATCH_NO
		newOutput?.beginDate = output?.BEGIN_DATE
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
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.userCode = output?.USER_CODE
		newOutput?.userGroupCode = output?.USER_GROUP_CODE
		newOutput?.userGroupId = output?.USER_GROUP_ID
		newOutput?.userGroupUserId = output?.USER_GROUP_USER_ID
		newOutput?.userId = output?.USER_ID
		newOutput?.version = output?.VERSION_

        newOutput
    }
}