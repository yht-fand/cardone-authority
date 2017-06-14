package api.vx.authority.permission

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.PermissionService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["permissionId": input.permissionId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.permissionId)) {
//          throw new CodeException("permissionId required", "许可标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(PermissionService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput['batchNo'] = output['batch_no']
		newOutput['beginDate'] = output['begin_date']
		newOutput['createdByCode'] = output['created_by_code']
		newOutput['createdDate'] = output['created_date']
		newOutput['dataStateCode'] = output['data_state_code']
		newOutput['departmentCode'] = output['department_code']
		newOutput['endDate'] = output['end_date']
		newOutput['flagCode'] = output['flag_code']
		newOutput['flagObjectCode'] = output['flag_object_code']
		newOutput['jsonData'] = output['json_data']
		newOutput['lastModifiedByCode'] = output['last_modified_by_code']
		newOutput['lastModifiedDate'] = output['last_modified_date']
		newOutput['name'] = output['name']
		newOutput['orderBy'] = output['order_by_']
		newOutput['orgCode'] = output['org_code']
		newOutput['parentCode'] = output['parent_code']
		newOutput['parentTreeCode'] = output['parent_tree_code']
		newOutput['parentTreeName'] = output['parent_tree_name']
		newOutput['permissionCode'] = output['permission_code']
		newOutput['permissionId'] = output['permission_id']
		newOutput['personalCode'] = output['personal_code']
		newOutput['siteCode'] = output['site_code']
		newOutput['stateCode'] = output['state_code']
		newOutput['systemInfoCode'] = output['system_info_code']
		newOutput['typeCode'] = output['type_code']
		newOutput['version'] = output['version_']

        newOutput
    }
}