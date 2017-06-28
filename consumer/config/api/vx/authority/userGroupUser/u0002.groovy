package top.cardone.api.vx.authority.userGroupUser

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupUserService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0002 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
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
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.userCode = input?.userCode
		newInput?.userGroupCode = input?.userGroupCode
		newInput?.userGroupUserId = input?.userGroupUserId
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupUserId)) {
//          throw new CodeException("userGroupUserId required", "用户组与用户标识必填")
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

		def readOne = ["userGroupUserCode": input.userGroupUserCode, "object_id": "userGroupUserId", "dataStateCode": "1"]

		def dbUserGroupUserId = ApplicationContextHolder.getBean(UserGroupUserService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbUserGroupUserId, input.userGroupUserId)) {
			throw new CodeException("userGroupUserId already exists", "用户组与用户编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupUserService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}