UPDATE c1_org_role SET END_DATE = NOW() WHERE INSTR(:ids, orgRoleId) > 0