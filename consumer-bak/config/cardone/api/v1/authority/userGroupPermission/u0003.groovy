package top.cardone.api.vx.authority.userGroupPermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupPermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0003 implements java.io.Serializable {
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
		newInput?.permissionCode = input?.permissionCode
		newInput?.permissionId = input?.permissionId
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.userGroupCode = input?.userGroupCode
		newInput?.userGroupId = input?.userGroupId
		newInput?.userGroupPermissionId = input?.userGroupPermissionId
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupPermissionId)) {
//          throw new CodeException("userGroupPermissionId required", "用户组与许可标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户组与许可名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户组与许可名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户组与许可名称需小于{0}个字符", 255)
//      }

		def readOne = ["userGroupPermissionCode": input.userGroupPermissionCode, "object_id": "userGroupPermissionId", "dataStateCode": "1"]

		def dbUserGroupPermissionId = ApplicationContextHolder.getBean(UserGroupPermissionService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbUserGroupPermissionId, input.userGroupPermissionId)) {
			throw new CodeException("userGroupPermissionId already exists", "用户组与许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupPermissionService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}