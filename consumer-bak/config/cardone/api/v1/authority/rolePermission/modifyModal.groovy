package top.cardone.api.vx.authority.rolePermission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RolePermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["rolePermissionId": input.rolePermissionId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.rolePermissionId)) {
//          throw new CodeException("rolePermissionId required", "角色与许可标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(RolePermissionService.class).findOneByRolePermissionId(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.BATCH_NO
		newOutput?.beginDate = output?.BEGIN_DATE
		newOutput?.createdByCode = output?.CREATED_BY_CODE
		newOutput?.createdById = output?.CREATED_BY_ID
		newOutput?.createdDate = output?.CREATED_DATE
		newOutput?.dataStateCode = output?.DATA_STATE_CODE
		newOutput?.departmentCode = output?.DEPARTMENT_CODE
		newOutput?.endDate = output?.END_DATE
		newOutput?.flagCode = output?.FLAG_CODE
		newOutput?.flagObjectCode = output?.FLAG_OBJECT_CODE
		newOutput?.jsonData = output?.JSON_DATA
		newOutput?.lastModifiedByCode = output?.LAST_MODIFIED_BY_CODE
		newOutput?.lastModifiedById = output?.LAST_MODIFIED_BY_ID
		newOutput?.lastModifiedDate = output?.LAST_MODIFIED_DATE
		newOutput?.orderBy = output?.ORDER_BY_
		newOutput?.orgCode = output?.ORG_CODE
		newOutput?.permissionCode = output?.PERMISSION_CODE
		newOutput?.permissionId = output?.PERMISSION_ID
		newOutput?.personalCode = output?.PERSONAL_CODE
		newOutput?.personalId = output?.PERSONAL_ID
		newOutput?.roleCode = output?.ROLE_CODE
		newOutput?.roleId = output?.ROLE_ID
		newOutput?.rolePermissionId = output?.ROLE_PERMISSION_ID
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.version = output?.VERSION_

        newOutput
    }
}