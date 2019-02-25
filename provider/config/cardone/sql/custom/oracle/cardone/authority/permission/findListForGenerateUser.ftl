SELECT
'user:view:*' AS "permissionId",
'user:view:*' AS "permissionCode",
'' AS "parentId",
'' AS "parentCode",
'user' AS "typeCode",
'generate' AS "flagCode",
'用户所有数据权限' AS "name",
to_date('1999-01-01 01:01:01','yyyy-mm-dd,hh:mi:ss') AS "beginDate",
to_date('9999-01-01 01:01:01','yyyy-mm-dd,hh:mi:ss') AS "endDate"
from dual
UNION ALL
SELECT
'user:view:'||COALESCE(t.USER_ID, '') AS "permissionId",
'user:view:'||COALESCE(t.USER_CODE, '') AS "permissionCode",
'user:view:*' AS "parentId",
'user:view:*' AS "parentCode",
'user' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user t
where t.state_code ='1' and t.data_state_code = '1'