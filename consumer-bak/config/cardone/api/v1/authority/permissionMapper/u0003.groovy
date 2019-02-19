package top.cardone.api.vx.authority.permissionMapper

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionMapperService
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
		newInput?.mapperCode = input?.mapperCode
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.permissionCode = input?.permissionCode
		newInput?.permissionId = input?.permissionId
		newInput?.permissionMapperId = input?.permissionMapperId
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
//      if (StringUtils.isBlank(input?.permissionMapperId)) {
//          throw new CodeException("permissionMapperId required", "许可映射标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "许可映射名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "许可映射名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "许可映射名称需小于{0}个字符", 255)
//      }

		def readOne = ["permissionMapperCode": input.permissionMapperCode, "object_id": "permissionMapperId", "dataStateCode": "1"]

		def dbPermissionMapperId = ApplicationContextHolder.getBean(PermissionMapperService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbPermissionMapperId, input.permissionMapperId)) {
			throw new CodeException("permissionMapperId already exists", "许可映射编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionMapperService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}