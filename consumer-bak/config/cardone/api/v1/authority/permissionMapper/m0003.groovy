package top.cardone.api.vx.authority.permissionMapper

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionMapperService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0003 implements java.io.Serializable {
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
		ApplicationContextHolder.getBean(PermissionMapperService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.batch_no
		newOutput?.beginDate = output?.begin_date
		newOutput?.createdByCode = output?.created_by_code
		newOutput?.createdById = output?.created_by_id
		newOutput?.createdDate = output?.created_date
		newOutput?.dataStateCode = output?.data_state_code
		newOutput?.departmentCode = output?.department_code
		newOutput?.endDate = output?.end_date
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedById = output?.last_modified_by_id
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.mapperCode = output?.mapper_code
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.permissionCode = output?.permission_code
		newOutput?.permissionId = output?.permission_id
		newOutput?.permissionMapperId = output?.permission_mapper_id
		newOutput?.personalCode = output?.personal_code
		newOutput?.personalId = output?.personal_id
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.typeCode = output?.type_code
		newOutput?.version = output?.version_

        newOutput
    }
}