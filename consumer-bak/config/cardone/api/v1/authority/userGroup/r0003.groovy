package top.cardone.api.vx.authority.userGroup

import top.cardone.configuration.service.DictionaryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.context.util.DateUtils
import top.cardone.authority.service.UserGroupService

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

class r0003 implements java.io.Serializable {
    def input(input) {
        input.startTime = DateUtils.parseDate(input.startTime)

        input.endTime = DateUtils.parseDate(input.endTime)

        if (Objects.nonNull(input.endTime)) {
            input.endTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(input.endTime.getTime()), ZoneId.systemDefault())

            input.endTime = Date.from(LocalDateTime.of(input.endTime.getYear(), input.endTime.getMonth(), input.endTime.getDayOfMonth(), 0, 0, 0).plusDays(1).atZone(ZoneId.systemDefault()).toInstant())
        }

        input
    }

    def validation(input) {
    }

    def func(input) {
		ApplicationContextHolder.getBean(UserGroupService.class).page(input)
    }

    def output(output) {
        def newOutput = [:]

        newOutput.totalElements = output.getTotalElements()
        newOutput.totalPages = output.getTotalPages()
        newOutput.hasPrevious = output.hasPrevious()
        newOutput.previous = output.pageable.previousOrFirst().getPageNumber() + 1
        newOutput.hasNext = output.pageable.next().getPageNumber() < output.getTotalPages()
        newOutput.next = output.pageable.next().getPageNumber() + 1
        newOutput.pages = []
        newOutput.page = output.getNumber() + 1

        def pagesRange = 6

        def pagesRangeHalf = new java.math.BigDecimal(pagesRange).divide(new BigDecimal(2), BigDecimal.ROUND_HALF_UP).toBigInteger().intValue()

        def pagesRangeStart = Math.max(output.getNumber() + 1 - pagesRangeHalf, 1)

        def pagesRangeEnd = Math.min((pagesRangeStart + pagesRange) - 1, output.getTotalPages())

        if (((pagesRangeEnd - pagesRangeStart) + 1) < pagesRange) {
            pagesRangeStart = Math.max((pagesRangeEnd - pagesRange) + 1, 1)
        }

        def pagesRangeLength = pagesRangeEnd - pagesRangeStart

        for (int i = 0; i <= pagesRangeLength; i++) {
            newOutput.pages.add(pagesRangeStart++)
        }

        newOutput.datas = []

        for (def contentItem : output.getContent()) {
			def data = [:]

            data['batchNo'] = contentItem['BATCH_NO']

            data['beginDate'] = contentItem['BEGIN_DATE']

            data['createdByCode'] = contentItem['CREATED_BY_CODE']

            data['createdById'] = contentItem['CREATED_BY_ID']

            data['createdDate'] = contentItem['CREATED_DATE']

            data['dataStateCode'] = contentItem['DATA_STATE_CODE']

            data['departmentCode'] = contentItem['DEPARTMENT_CODE']

            data['endDate'] = contentItem['END_DATE']

            data['flagCode'] = contentItem['FLAG_CODE']

            data['flagObjectCode'] = contentItem['FLAG_OBJECT_CODE']

            data['jsonData'] = contentItem['JSON_DATA']

            data['lastModifiedByCode'] = contentItem['LAST_MODIFIED_BY_CODE']

            data['lastModifiedById'] = contentItem['LAST_MODIFIED_BY_ID']

            data['lastModifiedDate'] = contentItem['LAST_MODIFIED_DATE']

            data['name'] = contentItem['NAME']

            data['orderBy'] = contentItem['ORDER_BY_']

            data['orgCode'] = contentItem['ORG_CODE']

            data['parentCode'] = contentItem['PARENT_CODE']

            data['parentId'] = contentItem['PARENT_ID']

            data['parentTreeCode'] = contentItem['PARENT_TREE_CODE']

            data['parentTreeId'] = contentItem['PARENT_TREE_ID']

            data['parentTreeName'] = contentItem['PARENT_TREE_NAME']

            data['personalCode'] = contentItem['PERSONAL_CODE']

            data['personalId'] = contentItem['PERSONAL_ID']

            data['siteCode'] = contentItem['SITE_CODE']

            data['stateCode'] = contentItem['STATE_CODE']

            data['systemInfoCode'] = contentItem['SYSTEM_INFO_CODE']

            data['typeCode'] = contentItem['TYPE_CODE']

            data['userGroupCode'] = contentItem['USER_GROUP_CODE']

            data['userGroupId'] = contentItem['USER_GROUP_ID']

            data['version'] = contentItem['VERSION_']

            data['flagName'] = top.cardone.configuration.utils.DictionaryUtils.readOneByDictionaryTypeCodesCache(['dictionaryTypeCodes': 'userGroupFlag,flag', 'dictionaryCode': contentItem['flag_code'], 'stateCode': '1', 'dataStateCode': '1',  'object_id': 'name'])

            data['stateName'] = top.cardone.configuration.utils.DictionaryUtils.readOneByDictionaryTypeCodesCache(['dictionaryTypeCodes': 'userGroupState,state', 'dictionaryCode': contentItem['state_code'], 'stateCode': '1', 'dataStateCode': '1',  'object_id': 'name'])

            data['dataStateName'] = top.cardone.configuration.utils.DictionaryUtils.readOneByDictionaryTypeCodesCache(['dictionaryTypeCodes': 'userGroupDataState,dataState', 'dictionaryCode': contentItem['data_state_code'], 'stateCode': '1', 'dataStateCode': '1',  'object_id': 'name'])

			newOutput.datas.add(data)
        }

        newOutput
    }
}