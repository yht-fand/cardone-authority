package api.vx.authority.permission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0002 {
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
		newInput['permissionCode'] = input['permissionCode']
		newInput['permissionId'] = input['permissionId']
		newInput['personalCode'] = input['personalCode']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['typeCode'] = input['typeCode']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.permissionCode)) {
//          throw new CodeException("permissionCode required", "许可编号必填")
//      }
//
//      if (StringUtils.length(input?.permissionCode) < 4) {
//          throw new CodeException("permissionCode minlength", "许可编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.permissionCode) > 255) {
//          throw new CodeException("permissionCode maxlength", "许可编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "许可名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "许可名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "许可名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['permissionCode': input.permissionCode]

		def count = ApplicationContextHolder.getBean(PermissionService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("permissionCode already exists", "许可编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]
    }
}