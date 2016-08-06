INSERT
INTO c1_user
(<#assign prefixName = ' '>
<#if (insert_address??) && (insert_address_value??)>
${prefixName} `ADDRESS`
<#assign prefixName = ','>
</#if>
<#if (insert_age??) && (insert_age_value??)>
${prefixName} `AGE`
<#assign prefixName = ','>
</#if>
<#if (insert_areaCode??) && (insert_areaCode_value??)>
${prefixName} `AREA_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} `BEGIN_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_birthday??) && (insert_birthday_value??)>
${prefixName} `BIRTHDAY`
<#assign prefixName = ','>
</#if>
<#if (insert_callName??) && (insert_callName_value??)>
${prefixName} `CALL_NAME`
<#assign prefixName = ','>
</#if>
<#if (insert_cityCode??) && (insert_cityCode_value??)>
${prefixName} `CITY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_companyName??) && (insert_companyName_value??)>
${prefixName} `COMPANY_NAME`
<#assign prefixName = ','>
</#if>
<#if (insert_countryCode??) && (insert_countryCode_value??)>
${prefixName} `COUNTRY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} `DATA_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_diplomaCode??) && (insert_diplomaCode_value??)>
${prefixName} `DIPLOMA_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_email??) && (insert_email_value??)>
${prefixName} `EMAIL`
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} `END_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName} `FLAG_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_folkCode??) && (insert_folkCode_value??)>
${prefixName} `FOLK_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_idCardNo??) && (insert_idCardNo_value??)>
${prefixName} `ID_CARD_NO`
<#assign prefixName = ','>
</#if>
<#if (insert_intro??) && (insert_intro_value??)>
${prefixName} `INTRO`
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} `LAST_MODIFIED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} `LAST_MODIFIED_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_locus??) && (insert_locus_value??)>
${prefixName} `LOCUS`
<#assign prefixName = ','>
</#if>
<#if (insert_marryStateCode??) && (insert_marryStateCode_value??)>
${prefixName} `MARRY_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_mobilePhone??) && (insert_mobilePhone_value??)>
${prefixName} `MOBILE_PHONE`
<#assign prefixName = ','>
</#if>
<#if (insert_name??) && (insert_name_value??)>
${prefixName} `NAME`
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_password??) && (insert_password_value??)>
${prefixName} `PASSWORD_`
<#assign prefixName = ','>
</#if>
<#if (insert_passwordSalt??) && (insert_passwordSalt_value??)>
${prefixName} `PASSWORD_SALT`
<#assign prefixName = ','>
</#if>
<#if (insert_permissionCodes??) && (insert_permissionCodes_value??)>
${prefixName} `PERMISSION_CODES`
<#assign prefixName = ','>
</#if>
<#if (insert_portraitUrl??) && (insert_portraitUrl_value??)>
${prefixName} `PORTRAIT_URL`
<#assign prefixName = ','>
</#if>
<#if (insert_privatePassword??) && (insert_privatePassword_value??)>
${prefixName} `PRIVATE_PASSWORD`
<#assign prefixName = ','>
</#if>
<#if (insert_privatePasswordSalt??) && (insert_privatePasswordSalt_value??)>
${prefixName} `PRIVATE_PASSWORD_SALT`
<#assign prefixName = ','>
</#if>
<#if (insert_professionCode??) && (insert_professionCode_value??)>
${prefixName} `PROFESSION_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_provinceCode??) && (insert_provinceCode_value??)>
${prefixName} `PROVINCE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_qq??) && (insert_qq_value??)>
${prefixName} `QQ`
<#assign prefixName = ','>
</#if>
<#if (insert_roleCodes??) && (insert_roleCodes_value??)>
${prefixName} `ROLE_CODES`
<#assign prefixName = ','>
</#if>
<#if (insert_sexCode??) && (insert_sexCode_value??)>
${prefixName} `SEX_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} `STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_telephone??) && (insert_telephone_value??)>
${prefixName} `TELEPHONE`
<#assign prefixName = ','>
</#if>
<#if (insert_userCode??) && (insert_userCode_value??)>
${prefixName} `USER_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_userId??) && (insert_userId_value??)>
${prefixName} `USER_ID`
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} `VERSION_`
<#assign prefixName = ','>
</#if>
<#if (insert_wfId??) && (insert_wfId_value??)>
${prefixName} `WF_ID`
<#assign prefixName = ','>
</#if>
)
VALUES
(<#assign prefixName = ' '>
<#if (insert_address??) && (insert_address_value??)>
${prefixName} :insert_address_value
<#assign prefixName = ','>
</#if>
<#if (insert_age??) && (insert_age_value??)>
${prefixName} :insert_age_value
<#assign prefixName = ','>
</#if>
<#if (insert_areaCode??) && (insert_areaCode_value??)>
${prefixName} :insert_areaCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} :insert_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_birthday??) && (insert_birthday_value??)>
${prefixName} :insert_birthday_value
<#assign prefixName = ','>
</#if>
<#if (insert_callName??) && (insert_callName_value??)>
${prefixName} :insert_callName_value
<#assign prefixName = ','>
</#if>
<#if (insert_cityCode??) && (insert_cityCode_value??)>
${prefixName} :insert_cityCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_companyName??) && (insert_companyName_value??)>
${prefixName} :insert_companyName_value
<#assign prefixName = ','>
</#if>
<#if (insert_countryCode??) && (insert_countryCode_value??)>
${prefixName} :insert_countryCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} :insert_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} :insert_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} :insert_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} :insert_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_diplomaCode??) && (insert_diplomaCode_value??)>
${prefixName} :insert_diplomaCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_email??) && (insert_email_value??)>
${prefixName} :insert_email_value
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} :insert_endDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName} :insert_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_folkCode??) && (insert_folkCode_value??)>
${prefixName} :insert_folkCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_idCardNo??) && (insert_idCardNo_value??)>
${prefixName} :insert_idCardNo_value
<#assign prefixName = ','>
</#if>
<#if (insert_intro??) && (insert_intro_value??)>
${prefixName} :insert_intro_value
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} :insert_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} :insert_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_locus??) && (insert_locus_value??)>
${prefixName} :insert_locus_value
<#assign prefixName = ','>
</#if>
<#if (insert_marryStateCode??) && (insert_marryStateCode_value??)>
${prefixName} :insert_marryStateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_mobilePhone??) && (insert_mobilePhone_value??)>
${prefixName} :insert_mobilePhone_value
<#assign prefixName = ','>
</#if>
<#if (insert_name??) && (insert_name_value??)>
${prefixName} :insert_name_value
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} :insert_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_password??) && (insert_password_value??)>
${prefixName} :insert_password_value
<#assign prefixName = ','>
</#if>
<#if (insert_passwordSalt??) && (insert_passwordSalt_value??)>
${prefixName} :insert_passwordSalt_value
<#assign prefixName = ','>
</#if>
<#if (insert_permissionCodes??) && (insert_permissionCodes_value??)>
${prefixName} :insert_permissionCodes_value
<#assign prefixName = ','>
</#if>
<#if (insert_portraitUrl??) && (insert_portraitUrl_value??)>
${prefixName} :insert_portraitUrl_value
<#assign prefixName = ','>
</#if>
<#if (insert_privatePassword??) && (insert_privatePassword_value??)>
${prefixName} :insert_privatePassword_value
<#assign prefixName = ','>
</#if>
<#if (insert_privatePasswordSalt??) && (insert_privatePasswordSalt_value??)>
${prefixName} :insert_privatePasswordSalt_value
<#assign prefixName = ','>
</#if>
<#if (insert_professionCode??) && (insert_professionCode_value??)>
${prefixName} :insert_professionCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_provinceCode??) && (insert_provinceCode_value??)>
${prefixName} :insert_provinceCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_qq??) && (insert_qq_value??)>
${prefixName} :insert_qq_value
<#assign prefixName = ','>
</#if>
<#if (insert_roleCodes??) && (insert_roleCodes_value??)>
${prefixName} :insert_roleCodes_value
<#assign prefixName = ','>
</#if>
<#if (insert_sexCode??) && (insert_sexCode_value??)>
${prefixName} :insert_sexCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} :insert_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_telephone??) && (insert_telephone_value??)>
${prefixName} :insert_telephone_value
<#assign prefixName = ','>
</#if>
<#if (insert_userCode??) && (insert_userCode_value??)>
${prefixName} :insert_userCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_userId??) && (insert_userId_value??)>
${prefixName} :insert_userId_value
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} :insert_version_value
<#assign prefixName = ','>
</#if>
<#if (insert_wfId??) && (insert_wfId_value??)>
${prefixName} :insert_wfId_value
<#assign prefixName = ','>
</#if>
)