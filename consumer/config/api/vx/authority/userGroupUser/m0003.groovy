package top.cardone.api.vx.authority.userGroupUser

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupUserService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0003 implements java.io.Serializable {
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
		newInput?.personalCode = input?.personalCode
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.userCode = input?.userCode
		newInput?.userGroupCode = input?.userGroupCode
		newInput?.userGroupUserId = input?.userGroupUserId
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.userGroupUserCode)) {
//          throw new CodeException("userGroupUserCode required", "用户组与用户编号必填")
//      }
//
//      if (StringUtils.length(input?.userGroupUserCode) < 4) {
//          throw new CodeException("userGroupUserCode minlength", "用户组与用户编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.userGroupUserCode) > 255) {
//          throw new CodeException("userGroupUserCode maxlength", "用户组与用户编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "用户组与用户名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "用户组与用户名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "用户组与用户名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['userGroupUserCode': input.userGroupUserCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(UserGroupUserService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("userGroupUserCode already exists", "用户组与用户编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupUserService.class).findOne(input)
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
		newOutput?.personalCode = output?.personal_code
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.userCode = output?.user_code
		newOutput?.userGroupCode = output?.user_group_code
		newOutput?.userGroupUserId = output?.user_group_user_id
		newOutput?.version = output?.version_

        newOutput
    }
}