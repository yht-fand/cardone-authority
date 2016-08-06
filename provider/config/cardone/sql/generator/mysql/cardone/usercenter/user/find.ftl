SELECT
<#assign prefixName = ' '>
<#if (select_address??)>
${prefixName} `ADDRESS`
<#assign prefixName = ','>
</#if>
<#if (select_age??)>
${prefixName} `AGE`
<#assign prefixName = ','>
</#if>
<#if (select_areaCode??)>
${prefixName} `AREA_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_beginDate??)>
${prefixName} `BEGIN_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_birthday??)>
${prefixName} `BIRTHDAY`
<#assign prefixName = ','>
</#if>
<#if (select_callName??)>
${prefixName} `CALL_NAME`
<#assign prefixName = ','>
</#if>
<#if (select_cityCode??)>
${prefixName} `CITY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_companyName??)>
${prefixName} `COMPANY_NAME`
<#assign prefixName = ','>
</#if>
<#if (select_countryCode??)>
${prefixName} `COUNTRY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_createdByCode??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_dataStateCode??)>
${prefixName} `DATA_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_diplomaCode??)>
${prefixName} `DIPLOMA_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_email??)>
${prefixName} `EMAIL`
<#assign prefixName = ','>
</#if>
<#if (select_endDate??)>
${prefixName} `END_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_flagCode??)>
${prefixName} `FLAG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_folkCode??)>
${prefixName} `FOLK_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_idCardNo??)>
${prefixName} `ID_CARD_NO`
<#assign prefixName = ','>
</#if>
<#if (select_intro??)>
${prefixName} `INTRO`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_locus??)>
${prefixName} `LOCUS`
<#assign prefixName = ','>
</#if>
<#if (select_marryStateCode??)>
${prefixName} `MARRY_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_mobilePhone??)>
${prefixName} `MOBILE_PHONE`
<#assign prefixName = ','>
</#if>
<#if (select_name??)>
${prefixName} `NAME`
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_password??)>
${prefixName} `PASSWORD_`
<#assign prefixName = ','>
</#if>
<#if (select_passwordSalt??)>
${prefixName} `PASSWORD_SALT`
<#assign prefixName = ','>
</#if>
<#if (select_permissionCodes??)>
${prefixName} `PERMISSION_CODES`
<#assign prefixName = ','>
</#if>
<#if (select_portraitUrl??)>
${prefixName} `PORTRAIT_URL`
<#assign prefixName = ','>
</#if>
<#if (select_privatePassword??)>
${prefixName} `PRIVATE_PASSWORD`
<#assign prefixName = ','>
</#if>
<#if (select_privatePasswordSalt??)>
${prefixName} `PRIVATE_PASSWORD_SALT`
<#assign prefixName = ','>
</#if>
<#if (select_professionCode??)>
${prefixName} `PROFESSION_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_provinceCode??)>
${prefixName} `PROVINCE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_qq??)>
${prefixName} `QQ`
<#assign prefixName = ','>
</#if>
<#if (select_roleCodes??)>
${prefixName} `ROLE_CODES`
<#assign prefixName = ','>
</#if>
<#if (select_sexCode??)>
${prefixName} `SEX_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_stateCode??)>
${prefixName} `STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_telephone??)>
${prefixName} `TELEPHONE`
<#assign prefixName = ','>
</#if>
<#if (select_userCode??)>
${prefixName} `USER_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_userId??)>
${prefixName} `USER_ID`
<#assign prefixName = ','>
</#if>
<#if (select_version??)>
${prefixName} `VERSION_`
<#assign prefixName = ','>
</#if>
<#if (select_wfId??)>
${prefixName} `WF_ID`
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
  `ADDRESS`
, `AGE`
, `AREA_CODE`
, `BEGIN_DATE`
, `BIRTHDAY`
, `CALL_NAME`
, `CITY_CODE`
, `COMPANY_NAME`
, `COUNTRY_CODE`
, `CREATED_BY_CODE`
, `CREATED_DATE`
, `DATA_STATE_CODE`
, `DEPARTMENT_CODE`
, `DIPLOMA_CODE`
, `EMAIL`
, `END_DATE`
, `FLAG_CODE`
, `FOLK_CODE`
, `ID_CARD_NO`
, `INTRO`
, `LAST_MODIFIED_BY_CODE`
, `LAST_MODIFIED_DATE`
, `LOCUS`
, `MARRY_STATE_CODE`
, `MOBILE_PHONE`
, `NAME`
, `ORG_CODE`
, `PASSWORD_`
, `PASSWORD_SALT`
, `PERMISSION_CODES`
, `PORTRAIT_URL`
, `PRIVATE_PASSWORD`
, `PRIVATE_PASSWORD_SALT`
, `PROFESSION_CODE`
, `PROVINCE_CODE`
, `QQ`
, `ROLE_CODES`
, `SEX_CODE`
, `STATE_CODE`
, `TELEPHONE`
, `USER_CODE`
, `USER_ID`
, `VERSION_`
, `WF_ID`
</#if>
FROM c1_user
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_address??)>
${prefixName} `ADDRESS` ${order_by_address_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_age??)>
${prefixName} `AGE` ${order_by_age_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_areaCode??)>
${prefixName} `AREA_CODE` ${order_by_areaCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_beginDate??)>
${prefixName} `BEGIN_DATE` ${order_by_beginDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_birthday??)>
${prefixName} `BIRTHDAY` ${order_by_birthday_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_callName??)>
${prefixName} `CALL_NAME` ${order_by_callName_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_cityCode??)>
${prefixName} `CITY_CODE` ${order_by_cityCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_companyName??)>
${prefixName} `COMPANY_NAME` ${order_by_companyName_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_countryCode??)>
${prefixName} `COUNTRY_CODE` ${order_by_countryCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdByCode??)>
${prefixName} `CREATED_BY_CODE` ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} `CREATED_DATE` ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` ${order_by_dataStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_diplomaCode??)>
${prefixName} `DIPLOMA_CODE` ${order_by_diplomaCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_email??)>
${prefixName} `EMAIL` ${order_by_email_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_endDate??)>
${prefixName} `END_DATE` ${order_by_endDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagCode??)>
${prefixName} `FLAG_CODE` ${order_by_flagCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_folkCode??)>
${prefixName} `FOLK_CODE` ${order_by_folkCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_idCardNo??)>
${prefixName} `ID_CARD_NO` ${order_by_idCardNo_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_intro??)>
${prefixName} `INTRO` ${order_by_intro_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` ${order_by_lastModifiedByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` ${order_by_lastModifiedDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_locus??)>
${prefixName} `LOCUS` ${order_by_locus_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_marryStateCode??)>
${prefixName} `MARRY_STATE_CODE` ${order_by_marryStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_mobilePhone??)>
${prefixName} `MOBILE_PHONE` ${order_by_mobilePhone_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_name??)>
${prefixName} `NAME` ${order_by_name_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} `ORG_CODE` ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_password??)>
${prefixName} `PASSWORD_` ${order_by_password_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_passwordSalt??)>
${prefixName} `PASSWORD_SALT` ${order_by_passwordSalt_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_permissionCodes??)>
${prefixName} `PERMISSION_CODES` ${order_by_permissionCodes_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_portraitUrl??)>
${prefixName} `PORTRAIT_URL` ${order_by_portraitUrl_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_privatePassword??)>
${prefixName} `PRIVATE_PASSWORD` ${order_by_privatePassword_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_privatePasswordSalt??)>
${prefixName} `PRIVATE_PASSWORD_SALT` ${order_by_privatePasswordSalt_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_professionCode??)>
${prefixName} `PROFESSION_CODE` ${order_by_professionCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_provinceCode??)>
${prefixName} `PROVINCE_CODE` ${order_by_provinceCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_qq??)>
${prefixName} `QQ` ${order_by_qq_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_roleCodes??)>
${prefixName} `ROLE_CODES` ${order_by_roleCodes_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_sexCode??)>
${prefixName} `SEX_CODE` ${order_by_sexCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_stateCode??)>
${prefixName} `STATE_CODE` ${order_by_stateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_telephone??)>
${prefixName} `TELEPHONE` ${order_by_telephone_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_userCode??)>
${prefixName} `USER_CODE` ${order_by_userCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_userId??)>
${prefixName} `USER_ID` ${order_by_userId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_version??)>
${prefixName} `VERSION_` ${order_by_version_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_wfId??)>
${prefixName} `WF_ID` ${order_by_wfId_value!}
<#assign prefixName = ','>
</#if>
