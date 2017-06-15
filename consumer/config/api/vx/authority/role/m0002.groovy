package top.cardone.api.vx.authority.role

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0002 implements java.io.Serializable {
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
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.parentCode = input?.parentCode
		newInput?.parentTreeCode = input?.parentTreeCode
		newInput?.parentTreeName = input?.parentTreeName
		newInput?.personalCode = input?.personalCode
		newInput?.roleCode = input?.roleCode
		newInput?.roleId = input?.roleId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.roleCode)) {
//          throw new CodeException("roleCode required", "角色编号必填")
//      }
//
//      if (StringUtils.length(input?.roleCode) < 4) {
//          throw new CodeException("roleCode minlength", "角色编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.roleCode) > 255) {
//          throw new CodeException("roleCode maxlength", "角色编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "角色名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "角色名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "角色名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['roleCode': input.roleCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(RoleService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("roleCode already exists", "角色编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(RoleService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.batch_no
		newOutput?.beginDate = output?.begin_date
		newOutput?.createdByCode = output?.created_by_code
		newOutput?.createdDate = output?.created_date
		newOutput?.dataStateCode = output?.data_state_code
		newOutput?.departmentCode = output?.department_code
		newOutput?.endDate = output?.end_date
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.name = output?.name
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.parentCode = output?.parent_code
		newOutput?.parentTreeCode = output?.parent_tree_code
		newOutput?.parentTreeName = output?.parent_tree_name
		newOutput?.personalCode = output?.personal_code
		newOutput?.roleCode = output?.role_code
		newOutput?.roleId = output?.role_id
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.typeCode = output?.type_code
		newOutput?.version = output?.version_

        newOutput
    }
}