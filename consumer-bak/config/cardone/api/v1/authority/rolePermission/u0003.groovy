package top.cardone.api.vx.authority.rolePermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RolePermissionService
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
		newInput?.roleCode = input?.roleCode
		newInput?.roleId = input?.roleId
		newInput?.rolePermissionId = input?.rolePermissionId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.rolePermissionId)) {
//          throw new CodeException("rolePermissionId required", "角色与许可标识必填")
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

		def readOne = ["rolePermissionCode": input.rolePermissionCode, "object_id": "rolePermissionId", "dataStateCode": "1"]

		def dbRolePermissionId = ApplicationContextHolder.getBean(RolePermissionService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbRolePermissionId, input.rolePermissionId)) {
			throw new CodeException("rolePermissionId already exists", "角色与许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(RolePermissionService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}