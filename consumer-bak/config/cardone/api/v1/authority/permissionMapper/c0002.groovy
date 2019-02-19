package top.cardone.api.vx.authority.permissionMapper

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionMapperService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0002 implements java.io.Serializable {
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
//      if (StringUtils.isBlank(input?.permissionMapperCode)) {
//          throw new CodeException("permissionMapperCode required", "许可映射编号必填")
//      }
//
//      if (StringUtils.length(input?.permissionMapperCode) < 4) {
//          throw new CodeException("permissionMapperCode minlength", "许可映射编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.permissionMapperCode) > 255) {
//          throw new CodeException("permissionMapperCode maxlength", "许可映射编号需小于{0}个字符", 255)
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
		
		def readOne = ['permissionMapperCode': input.permissionMapperCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(PermissionMapperService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("permissionMapperCode already exists", "许可映射编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionMapperService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}