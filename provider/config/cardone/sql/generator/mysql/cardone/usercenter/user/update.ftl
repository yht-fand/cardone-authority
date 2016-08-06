UPDATE c1_user
<#assign prefixName = 'SET'>
<#if (update_address??)>
${prefixName} `ADDRESS` = :update_address_value
<#assign prefixName = ','>
</#if>
<#if (update_age??)>
${prefixName} `AGE` = :update_age_value
<#assign prefixName = ','>
</#if>
<#if (update_areaCode??)>
${prefixName} `AREA_CODE` = :update_areaCode_value
<#assign prefixName = ','>
</#if>
<#if (update_beginDate??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (update_birthday??)>
${prefixName} `BIRTHDAY` = :update_birthday_value
<#assign prefixName = ','>
</#if>
<#if (update_callName??)>
${prefixName} `CALL_NAME` = :update_callName_value
<#assign prefixName = ','>
</#if>
<#if (update_cityCode??)>
${prefixName} `CITY_CODE` = :update_cityCode_value
<#assign prefixName = ','>
</#if>
<#if (update_companyName??)>
${prefixName} `COMPANY_NAME` = :update_companyName_value
<#assign prefixName = ','>
</#if>
<#if (update_countryCode??)>
${prefixName} `COUNTRY_CODE` = :update_countryCode_value
<#assign prefixName = ','>
</#if>
<#if (update_createdByCode??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (update_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (update_diplomaCode??)>
${prefixName} `DIPLOMA_CODE` = :update_diplomaCode_value
<#assign prefixName = ','>
</#if>
<#if (update_email??)>
${prefixName} `EMAIL` = :update_email_value
<#assign prefixName = ','>
</#if>
<#if (update_endDate??)>
${prefixName} `END_DATE` = :update_endDate_value
<#assign prefixName = ','>
</#if>
<#if (update_flagCode??)>
${prefixName} `FLAG_CODE` = :update_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (update_folkCode??)>
${prefixName} `FOLK_CODE` = :update_folkCode_value
<#assign prefixName = ','>
</#if>
<#if (update_idCardNo??)>
${prefixName} `ID_CARD_NO` = :update_idCardNo_value
<#assign prefixName = ','>
</#if>
<#if (update_intro??)>
${prefixName} `INTRO` = :update_intro_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (update_locus??)>
${prefixName} `LOCUS` = :update_locus_value
<#assign prefixName = ','>
</#if>
<#if (update_marryStateCode??)>
${prefixName} `MARRY_STATE_CODE` = :update_marryStateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_mobilePhone??)>
${prefixName} `MOBILE_PHONE` = :update_mobilePhone_value
<#assign prefixName = ','>
</#if>
<#if (update_name??)>
${prefixName} `NAME` = :update_name_value
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (update_password??)>
${prefixName} `PASSWORD_` = :update_password_value
<#assign prefixName = ','>
</#if>
<#if (update_passwordSalt??)>
${prefixName} `PASSWORD_SALT` = :update_passwordSalt_value
<#assign prefixName = ','>
</#if>
<#if (update_permissionCodes??)>
${prefixName} `PERMISSION_CODES` = :update_permissionCodes_value
<#assign prefixName = ','>
</#if>
<#if (update_portraitUrl??)>
${prefixName} `PORTRAIT_URL` = :update_portraitUrl_value
<#assign prefixName = ','>
</#if>
<#if (update_privatePassword??)>
${prefixName} `PRIVATE_PASSWORD` = :update_privatePassword_value
<#assign prefixName = ','>
</#if>
<#if (update_privatePasswordSalt??)>
${prefixName} `PRIVATE_PASSWORD_SALT` = :update_privatePasswordSalt_value
<#assign prefixName = ','>
</#if>
<#if (update_professionCode??)>
${prefixName} `PROFESSION_CODE` = :update_professionCode_value
<#assign prefixName = ','>
</#if>
<#if (update_provinceCode??)>
${prefixName} `PROVINCE_CODE` = :update_provinceCode_value
<#assign prefixName = ','>
</#if>
<#if (update_qq??)>
${prefixName} `QQ` = :update_qq_value
<#assign prefixName = ','>
</#if>
<#if (update_roleCodes??)>
${prefixName} `ROLE_CODES` = :update_roleCodes_value
<#assign prefixName = ','>
</#if>
<#if (update_sexCode??)>
${prefixName} `SEX_CODE` = :update_sexCode_value
<#assign prefixName = ','>
</#if>
<#if (update_stateCode??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_telephone??)>
${prefixName} `TELEPHONE` = :update_telephone_value
<#assign prefixName = ','>
</#if>
<#if (update_userCode??)>
${prefixName} `USER_CODE` = :update_userCode_value
<#assign prefixName = ','>
</#if>
<#if (update_userId??)>
${prefixName} `USER_ID` = :update_userId_value
<#assign prefixName = ','>
</#if>
<#if (update_version??)>
${prefixName} `VERSION_` = :update_version_value
<#assign prefixName = ','>
</#if>
<#if (update_wfId??)>
${prefixName} `WF_ID` = :update_wfId_value
<#assign prefixName = ','>
</#if>
<#include "where.ftl">