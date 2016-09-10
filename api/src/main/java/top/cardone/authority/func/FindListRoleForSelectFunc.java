package top.cardone.authority.func;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import top.cardone.authority.service.RoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/10.
 */
public class FindListRoleForSelectFunc implements Func1<List<Map<String, Object>>, Map<String, Object>> {
	@Override
	public List<Map<String, Object>> func(Map<String, Object> stringObjectMap) {
		Map<String, Object> findListMap = Maps.newHashMap();

		findListMap.put("order_by_roleCode", "1");

		List<Map<String, Object>> roleList = ApplicationContextHolder.getBean(RoleService.class).findListCache(findListMap);

		List<Map<String, Object>> newRoleList = Lists.newArrayList();

		for (Map<String, Object> role : roleList) {
			Map<String, Object> newRole = Maps.newHashMap();

			newRole.put("text", MapUtils.getString(role, "NAME"));
			newRole.put("value", MapUtils.getString(role, "ROLE_CODE"));

			newRoleList.add(newRole);
		}

		return newRoleList;
	}
}
