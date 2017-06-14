package api.vx.authority.userGroup

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def userGroupIds = input?.userGroupIds?.split(",")

        if (!userGroupIds) {
            throw new CodeException("userGroupIds required", "用户组标识集合必填")
        }

        def userGroupIdList = []

        for (def userGroupId : userGroupIds) {
            userGroupIdList.add(["userGroupId": userGroupId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["userGroupIds": userGroupIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(UserGroupService.class).updateListCache(input?.userGroupIds)]
    }

    def output(output) {
        output
    }
}