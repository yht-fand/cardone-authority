package api.vx.authority.userGroupRole

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupRoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0001 {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['endDate'] = input['endDate']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['personalCode'] = input['personalCode']
		newInput['roleCode'] = input['roleCode']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['userGroupCode'] = input['userGroupCode']
		newInput['userGroupRoleId'] = input['userGroupRoleId']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupRoleId)) {
//          throw new CodeException("userGroupRoleId required", "用户组与角色标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户组与角色名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户组与角色名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户组与角色名称需小于{0}个字符", 255)
//      }

		def readOne = ["userGroupRoleCode": input.userGroupRoleCode, "object_id": "userGroupRoleId"]

		String dbUserGroupRoleId = ApplicationContextHolder.getBean(UserGroupRoleService.class).readOne(String.class, readOne)

		if ((dbUserGroupRoleId != null) && !StringUtils.equals(dbUserGroupRoleId, input.userGroupRoleId)) {
			throw new CodeException("userGroupRoleId already exists", "用户组与角色编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupRoleService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]
    }
}