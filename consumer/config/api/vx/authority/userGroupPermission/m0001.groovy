package top.cardone.api.vx.authority.userGroupPermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupPermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0001 implements java.io.Serializable {
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
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.userGroupCode = input?.userGroupCode
		newInput?.userGroupPermissionId = input?.userGroupPermissionId
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupPermissionCode)) {
//          throw new CodeException("userGroupPermissionCode required", "用户组与许可编号必填")
//      }
//
//      if (StringUtils.length(input?.userGroupPermissionCode) < 4) {
//          throw new CodeException("userGroupPermissionCode minlength", "用户组与许可编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.userGroupPermissionCode) > 255) {
//          throw new CodeException("userGroupPermissionCode maxlength", "用户组与许可编号需小于{0}个字符", 255)
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
		
		def readOne = ['userGroupPermissionCode': input.userGroupPermissionCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(UserGroupPermissionService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("userGroupPermissionCode already exists", "用户组与许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupPermissionService.class).findOne(input)
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
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.permissionCode = output?.permission_code
		newOutput?.personalCode = output?.personal_code
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.userGroupCode = output?.user_group_code
		newOutput?.userGroupPermissionId = output?.user_group_permission_id
		newOutput?.version = output?.version_

        newOutput
    }
}