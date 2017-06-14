package api.vx.authority.userGroupUser

import org.apache.commons.lang3.StringUtils
import top.cardone.authority.service.UserGroupUserService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def userGroupUserIds = input?.userGroupUserIds?.split(",")

        if (!userGroupUserIds) {
            throw new CodeException("userGroupUserIds required", "用户组与用户标识集合必填")
        }

        def userGroupUserIdList = []

        for (def userGroupUserId : userGroupUserIds) {
            userGroupUserIdList.add(["userGroupUserId": userGroupUserId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["userGroupUserIds": userGroupUserIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(UserGroupUserService.class).deleteListCache(input?.userGroupUserIds)]
    }

    def output(output) {
        output
    }
}