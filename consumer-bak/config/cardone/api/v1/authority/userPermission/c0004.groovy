package top.cardone.api.vx.authority.userPermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserPermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0004 implements java.io.Serializable {
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
		newInput?.userCode = input?.userCode
		newInput?.userId = input?.userId
		newInput?.userPermissionId = input?.userPermissionId
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userPermissionCode)) {
//          throw new CodeException("userPermissionCode required", "用户与许可编号必填")
//      }
//
//      if (StringUtils.length(input?.userPermissionCode) < 4) {
//          throw new CodeException("userPermissionCode minlength", "用户与许可编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.userPermissionCode) > 255) {
//          throw new CodeException("userPermissionCode maxlength", "用户与许可编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户与许可名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户与许可名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户与许可名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['userPermissionCode': input.userPermissionCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(UserPermissionService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("userPermissionCode already exists", "用户与许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserPermissionService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}