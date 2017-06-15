package top.cardone.api.vx.authority.rolePermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RolePermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0004 implements java.io.Serializable {
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
		newInput?.permissionCode = input?.permissionCode
		newInput?.personalCode = input?.personalCode
		newInput?.roleCode = input?.roleCode
		newInput?.rolePermissionId = input?.rolePermissionId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.rolePermissionCode)) {
//          throw new CodeException("rolePermissionCode required", "角色与许可编号必填")
//      }
//
//      if (StringUtils.length(input?.rolePermissionCode) < 4) {
//          throw new CodeException("rolePermissionCode minlength", "角色与许可编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.rolePermissionCode) > 255) {
//          throw new CodeException("rolePermissionCode maxlength", "角色与许可编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "角色与许可名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "角色与许可名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "角色与许可名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['rolePermissionCode': input.rolePermissionCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(RolePermissionService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("rolePermissionCode already exists", "角色与许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(RolePermissionService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}