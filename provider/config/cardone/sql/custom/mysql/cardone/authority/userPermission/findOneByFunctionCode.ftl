SELECT IFNULL((SELECT GROUP_CONCAT(REPLACE(up.`PERMISSION_CODE`, CONCAT(:functionCode, ':view-department-tree:'), '')) FROM `c1_user_permission` up
WHERE up.`USER_CODE` = :userCode AND up.`PERMISSION_CODE` LIKE CONCAT(:functionCode, ':view-department-tree:', '%')
AND ((up.`BEGIN_DATE` IS NULL OR NOW() >= up.`BEGIN_DATE`) AND (up.`END_DATE` IS NULL OR NOW() <= up.`END_DATE`))), UUID()) AS permission_department_trees,
IFNULL((SELECT GROUP_CONCAT(REPLACE(up.`PERMISSION_CODE`, CONCAT(:functionCode, ':view-department:'), '')) FROM `c1_user_permission` up
WHERE up.`USER_CODE` = :userCode AND up.`PERMISSION_CODE` LIKE CONCAT(:functionCode, ':view-department:', '%')
AND ((up.`BEGIN_DATE` IS NULL OR NOW() >= up.`BEGIN_DATE`) AND (up.`END_DATE` IS NULL OR NOW() <= up.`END_DATE`))), UUID()) AS permission_departments,
IFNULL((SELECT GROUP_CONCAT(REPLACE(up.`PERMISSION_CODE`, CONCAT(:functionCode, ':view-user:'), '')) FROM `c1_user_permission` up
WHERE up.`USER_CODE` = :userCode AND up.`PERMISSION_CODE` LIKE CONCAT(:functionCode, ':view-user:', '%')
AND ((up.`BEGIN_DATE` IS NULL OR NOW() >= up.`BEGIN_DATE`) AND (up.`END_DATE` IS NULL OR NOW() <= up.`END_DATE`))), UUID()) AS permission_users,
IFNULL((SELECT GROUP_CONCAT(REPLACE(up.`PERMISSION_CODE`, CONCAT(:functionCode, ':view:'), '')) FROM `c1_user_permission` up
WHERE up.`USER_CODE` = :userCode AND up.`PERMISSION_CODE` LIKE CONCAT(:functionCode, ':view:', '%')
AND ((up.`BEGIN_DATE` IS NULL OR NOW() >= up.`BEGIN_DATE`) AND (up.`END_DATE` IS NULL OR NOW() <= up.`END_DATE`))), UUID()) AS permissions
FROM DUAL