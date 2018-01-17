package top.cardone.api.vx.authority.userRole

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserRoleService
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
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.roleCode = input?.roleCode
		newInput?.roleId = input?.roleId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.userCode = input?.userCode
		newInput?.userId = input?.userId
		newInput?.userRoleId = input?.userRoleId
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userRoleCode)) {
//          throw new CodeException("userRoleCode required", "用户与角色编号必填")
//      }
//
//      if (StringUtils.length(input?.userRoleCode) < 4) {
//          throw new CodeException("userRoleCode minlength", "用户与角色编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.userRoleCode) > 255) {
//          throw new CodeException("userRoleCode maxlength", "用户与角色编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户与角色名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户与角色名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户与角色名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['userRoleCode': input.userRoleCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(UserRoleService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("userRoleCode already exists", "用户与角色编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserRoleService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}