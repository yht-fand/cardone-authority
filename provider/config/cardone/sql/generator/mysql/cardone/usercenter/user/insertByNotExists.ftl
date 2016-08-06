INSERT
INTO
c1_user
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
(SELECT
<#assign prefixName = ' '>
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
FROM DUAL WHERE NOT EXISTS (SELECT 1 FROM c1_user E
<#assign prefixName = 'WHERE'>
<#if (where_and_eq_address??)>
<#if (where_and_eq_address_value??)>
${prefixName} E.ADDRESS = :where_and_eq_address_value
<#else>
${prefixName} E.ADDRESS IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_age??)>
<#if (where_and_eq_age_value??)>
${prefixName} E.AGE = :where_and_eq_age_value
<#else>
${prefixName} E.AGE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_areaCode??)>
<#if (where_and_eq_areaCode_value??)>
${prefixName} E.AREA_CODE = :where_and_eq_areaCode_value
<#else>
${prefixName} E.AREA_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName} E.BEGIN_DATE = :where_and_eq_beginDate_value
<#else>
${prefixName} E.BEGIN_DATE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_birthday??)>
<#if (where_and_eq_birthday_value??)>
${prefixName} E.BIRTHDAY = :where_and_eq_birthday_value
<#else>
${prefixName} E.BIRTHDAY IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_callName??)>
<#if (where_and_eq_callName_value??)>
${prefixName} E.CALL_NAME = :where_and_eq_callName_value
<#else>
${prefixName} E.CALL_NAME IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_cityCode??)>
<#if (where_and_eq_cityCode_value??)>
${prefixName} E.CITY_CODE = :where_and_eq_cityCode_value
<#else>
${prefixName} E.CITY_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_companyName??)>
<#if (where_and_eq_companyName_value??)>
${prefixName} E.COMPANY_NAME = :where_and_eq_companyName_value
<#else>
${prefixName} E.COMPANY_NAME IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_countryCode??)>
<#if (where_and_eq_countryCode_value??)>
${prefixName} E.COUNTRY_CODE = :where_and_eq_countryCode_value
<#else>
${prefixName} E.COUNTRY_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} E.CREATED_BY_CODE = :where_and_eq_createdByCode_value
<#else>
${prefixName} E.CREATED_BY_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} E.CREATED_DATE = :where_and_eq_createdDate_value
<#else>
${prefixName} E.CREATED_DATE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName} E.DATA_STATE_CODE = :where_and_eq_dataStateCode_value
<#else>
${prefixName} E.DATA_STATE_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} E.DEPARTMENT_CODE = :where_and_eq_departmentCode_value
<#else>
${prefixName} E.DEPARTMENT_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_diplomaCode??)>
<#if (where_and_eq_diplomaCode_value??)>
${prefixName} E.DIPLOMA_CODE = :where_and_eq_diplomaCode_value
<#else>
${prefixName} E.DIPLOMA_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_email??)>
<#if (where_and_eq_email_value??)>
${prefixName} E.EMAIL = :where_and_eq_email_value
<#else>
${prefixName} E.EMAIL IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName} E.END_DATE = :where_and_eq_endDate_value
<#else>
${prefixName} E.END_DATE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName} E.FLAG_CODE = :where_and_eq_flagCode_value
<#else>
${prefixName} E.FLAG_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_folkCode??)>
<#if (where_and_eq_folkCode_value??)>
${prefixName} E.FOLK_CODE = :where_and_eq_folkCode_value
<#else>
${prefixName} E.FOLK_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_idCardNo??)>
<#if (where_and_eq_idCardNo_value??)>
${prefixName} E.ID_CARD_NO = :where_and_eq_idCardNo_value
<#else>
${prefixName} E.ID_CARD_NO IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_intro??)>
<#if (where_and_eq_intro_value??)>
${prefixName} E.INTRO = :where_and_eq_intro_value
<#else>
${prefixName} E.INTRO IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName} E.LAST_MODIFIED_BY_CODE = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName} E.LAST_MODIFIED_BY_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName} E.LAST_MODIFIED_DATE = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName} E.LAST_MODIFIED_DATE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_locus??)>
<#if (where_and_eq_locus_value??)>
${prefixName} E.LOCUS = :where_and_eq_locus_value
<#else>
${prefixName} E.LOCUS IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_marryStateCode??)>
<#if (where_and_eq_marryStateCode_value??)>
${prefixName} E.MARRY_STATE_CODE = :where_and_eq_marryStateCode_value
<#else>
${prefixName} E.MARRY_STATE_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_mobilePhone??)>
<#if (where_and_eq_mobilePhone_value??)>
${prefixName} E.MOBILE_PHONE = :where_and_eq_mobilePhone_value
<#else>
${prefixName} E.MOBILE_PHONE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName} E.NAME = :where_and_eq_name_value
<#else>
${prefixName} E.NAME IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} E.ORG_CODE = :where_and_eq_orgCode_value
<#else>
${prefixName} E.ORG_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_password??)>
<#if (where_and_eq_password_value??)>
${prefixName} E.PASSWORD_ = :where_and_eq_password_value
<#else>
${prefixName} E.PASSWORD_ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_passwordSalt??)>
<#if (where_and_eq_passwordSalt_value??)>
${prefixName} E.PASSWORD_SALT = :where_and_eq_passwordSalt_value
<#else>
${prefixName} E.PASSWORD_SALT IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_permissionCodes??)>
<#if (where_and_eq_permissionCodes_value??)>
${prefixName} E.PERMISSION_CODES = :where_and_eq_permissionCodes_value
<#else>
${prefixName} E.PERMISSION_CODES IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_portraitUrl??)>
<#if (where_and_eq_portraitUrl_value??)>
${prefixName} E.PORTRAIT_URL = :where_and_eq_portraitUrl_value
<#else>
${prefixName} E.PORTRAIT_URL IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_privatePassword??)>
<#if (where_and_eq_privatePassword_value??)>
${prefixName} E.PRIVATE_PASSWORD = :where_and_eq_privatePassword_value
<#else>
${prefixName} E.PRIVATE_PASSWORD IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_privatePasswordSalt??)>
<#if (where_and_eq_privatePasswordSalt_value??)>
${prefixName} E.PRIVATE_PASSWORD_SALT = :where_and_eq_privatePasswordSalt_value
<#else>
${prefixName} E.PRIVATE_PASSWORD_SALT IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_professionCode??)>
<#if (where_and_eq_professionCode_value??)>
${prefixName} E.PROFESSION_CODE = :where_and_eq_professionCode_value
<#else>
${prefixName} E.PROFESSION_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_provinceCode??)>
<#if (where_and_eq_provinceCode_value??)>
${prefixName} E.PROVINCE_CODE = :where_and_eq_provinceCode_value
<#else>
${prefixName} E.PROVINCE_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_qq??)>
<#if (where_and_eq_qq_value??)>
${prefixName} E.QQ = :where_and_eq_qq_value
<#else>
${prefixName} E.QQ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_roleCodes??)>
<#if (where_and_eq_roleCodes_value??)>
${prefixName} E.ROLE_CODES = :where_and_eq_roleCodes_value
<#else>
${prefixName} E.ROLE_CODES IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_sexCode??)>
<#if (where_and_eq_sexCode_value??)>
${prefixName} E.SEX_CODE = :where_and_eq_sexCode_value
<#else>
${prefixName} E.SEX_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName} E.STATE_CODE = :where_and_eq_stateCode_value
<#else>
${prefixName} E.STATE_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_telephone??)>
<#if (where_and_eq_telephone_value??)>
${prefixName} E.TELEPHONE = :where_and_eq_telephone_value
<#else>
${prefixName} E.TELEPHONE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_userCode??)>
<#if (where_and_eq_userCode_value??)>
${prefixName} E.USER_CODE = :where_and_eq_userCode_value
<#else>
${prefixName} E.USER_CODE IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_userId??)>
<#if (where_and_eq_userId_value??)>
${prefixName} E.USER_ID = :where_and_eq_userId_value
<#else>
${prefixName} E.USER_ID IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName} E.VERSION_ = :where_and_eq_version_value
<#else>
${prefixName} E.VERSION_ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_wfId??)>
<#if (where_and_eq_wfId_value??)>
${prefixName} E.WF_ID = :where_and_eq_wfId_value
<#else>
${prefixName} E.WF_ID IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
))