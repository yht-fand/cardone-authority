DELETE
FROM `c1_role_permission`
WHERE `FLAG_CODE` = :flagCode AND FLAG_OBJECT_CODE <> :flagObjectCode