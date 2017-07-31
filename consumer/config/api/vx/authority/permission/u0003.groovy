package top.cardone.api.vx.authority.permission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionService
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
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.parentCode = input?.parentCode
		newInput?.parentTreeCode = input?.parentTreeCode
		newInput?.parentTreeId = input?.parentTreeId
		newInput?.parentTreeName = input?.parentTreeName
		newInput?.permissionCode = input?.permissionCode
		newInput?.permissionId = input?.permissionId
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.permissionId)) {
//          throw new CodeException("permissionId required", "许可标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "许可名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "许可名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "许可名称需小于{0}个字符", 255)
//      }

		def readOne = ["permissionCode": input.permissionCode, "object_id": "permissionId", "dataStateCode": "1"]

		def dbPermissionId = ApplicationContextHolder.getBean(PermissionService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbPermissionId, input.permissionId)) {
			throw new CodeException("permissionId already exists", "许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}