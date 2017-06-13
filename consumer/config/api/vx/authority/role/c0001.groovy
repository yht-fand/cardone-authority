package api.vx.authority.role

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.RoleService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0001 {
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
		newInput['name'] = input['name']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['parentCode'] = input['parentCode']
		newInput['parentTreeCode'] = input['parentTreeCode']
		newInput['parentTreeName'] = input['parentTreeName']
		newInput['personalCode'] = input['personalCode']
		newInput['roleCode'] = input['roleCode']
		newInput['roleId'] = input['roleId']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['typeCode'] = input['typeCode']
		newInput['version'] = input['version']

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
		
		def readOne = ['roleCode': input.roleCode]

		def count = ApplicationContextHolder.getBean(RoleService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("roleCode already exists", "角色编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(RoleService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['data': output]        
    }
}