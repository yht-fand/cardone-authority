SELECT
<#switch (object_id!)>
<#case "address">
ADDRESS AS address
<#break>
<#case "age">
AGE AS age
<#break>
<#case "areaCode">
AREA_CODE AS areaCode
<#break>
<#case "beginDate">
BEGIN_DATE AS beginDate
<#break>
<#case "birthday">
BIRTHDAY AS birthday
<#break>
<#case "callName">
CALL_NAME AS callName
<#break>
<#case "cityCode">
CITY_CODE AS cityCode
<#break>
<#case "companyName">
COMPANY_NAME AS companyName
<#break>
<#case "countryCode">
COUNTRY_CODE AS countryCode
<#break>
<#case "createdByCode">
CREATED_BY_CODE AS createdByCode
<#break>
<#case "createdDate">
CREATED_DATE AS createdDate
<#break>
<#case "dataStateCode">
DATA_STATE_CODE AS dataStateCode
<#break>
<#case "departmentCode">
DEPARTMENT_CODE AS departmentCode
<#break>
<#case "diplomaCode">
DIPLOMA_CODE AS diplomaCode
<#break>
<#case "email">
EMAIL AS email
<#break>
<#case "endDate">
END_DATE AS endDate
<#break>
<#case "flagCode">
FLAG_CODE AS flagCode
<#break>
<#case "folkCode">
FOLK_CODE AS folkCode
<#break>
<#case "idCardNo">
ID_CARD_NO AS idCardNo
<#break>
<#case "intro">
INTRO AS intro
<#break>
<#case "lastModifiedByCode">
LAST_MODIFIED_BY_CODE AS lastModifiedByCode
<#break>
<#case "lastModifiedDate">
LAST_MODIFIED_DATE AS lastModifiedDate
<#break>
<#case "locus">
LOCUS AS locus
<#break>
<#case "marryStateCode">
MARRY_STATE_CODE AS marryStateCode
<#break>
<#case "mobilePhone">
MOBILE_PHONE AS mobilePhone
<#break>
<#case "name">
NAME AS name
<#break>
<#case "orgCode">
ORG_CODE AS orgCode
<#break>
<#case "password">
PASSWORD_ AS password
<#break>
<#case "passwordSalt">
PASSWORD_SALT AS passwordSalt
<#break>
<#case "permissionCodes">
PERMISSION_CODES AS permissionCodes
<#break>
<#case "portraitUrl">
PORTRAIT_URL AS portraitUrl
<#break>
<#case "privatePassword">
PRIVATE_PASSWORD AS privatePassword
<#break>
<#case "privatePasswordSalt">
PRIVATE_PASSWORD_SALT AS privatePasswordSalt
<#break>
<#case "professionCode">
PROFESSION_CODE AS professionCode
<#break>
<#case "provinceCode">
PROVINCE_CODE AS provinceCode
<#break>
<#case "qq">
QQ AS qq
<#break>
<#case "roleCodes">
ROLE_CODES AS roleCodes
<#break>
<#case "sexCode">
SEX_CODE AS sexCode
<#break>
<#case "stateCode">
STATE_CODE AS stateCode
<#break>
<#case "telephone">
TELEPHONE AS telephone
<#break>
<#case "userCode">
USER_CODE AS userCode
<#break>
<#case "userId">
USER_ID AS userId
<#break>
<#case "version">
VERSION_ AS version
<#break>
<#case "wfId">
WF_ID AS wfId
<#break>
<#default>
COUNT(1) AS COUNT_
</#switch>
FROM c1_user
<#include "where.ftl">