package top.cardone.api.vx.authority.userGroupRole

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupRoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["userGroupRoleId": input.userGroupRoleId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupRoleId)) {
//          throw new CodeException("userGroupRoleId required", "用户组与角色标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupRoleService.class).findOneByUserGroupRoleId(input)
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
		newOutput?.personalCode = output?.PERSONAL_CODE
		newOutput?.personalId = output?.PERSONAL_ID
		newOutput?.roleCode = output?.ROLE_CODE
		newOutput?.roleId = output?.ROLE_ID
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.userGroupCode = output?.USER_GROUP_CODE
		newOutput?.userGroupId = output?.USER_GROUP_ID
		newOutput?.userGroupRoleId = output?.USER_GROUP_ROLE_ID
		newOutput?.version = output?.VERSION_

        newOutput
    }
}