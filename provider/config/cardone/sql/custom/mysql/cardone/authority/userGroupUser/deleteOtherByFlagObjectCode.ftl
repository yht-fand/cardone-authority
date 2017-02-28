DELETE
FROM `c1_user_group_user`
WHERE `FLAG_CODE` = :flagCode AND FLAG_OBJECT_CODE <> :flagObjectCode