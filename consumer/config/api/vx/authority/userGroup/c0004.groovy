package api.vx.authority.userGroup

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0004 implements java.io.Serializable {
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
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['typeCode'] = input['typeCode']
		newInput['userGroupCode'] = input['userGroupCode']
		newInput['userGroupId'] = input['userGroupId']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupCode)) {
//          throw new CodeException("userGroupCode required", "用户组编号必填")
//      }
//
//      if (StringUtils.length(input?.userGroupCode) < 4) {
//          throw new CodeException("userGroupCode minlength", "用户组编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.userGroupCode) > 255) {
//          throw new CodeException("userGroupCode maxlength", "用户组编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户组名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户组名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户组名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['userGroupCode': input.userGroupCode]

		def count = ApplicationContextHolder.getBean(UserGroupService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("userGroupCode already exists", "用户组编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]
    }
}