package com.evan.service;

import java.util.Set;

import com.evan.util.Pagination;
import com.evan.util.RKey;
import com.evan.util.ztree.ZNode;

public interface ViewService {

	Set<ZNode> getLeftTree();

	Set<RKey> getRedisKeys(Pagination pagination, String serverName, String dbIndex,
			String[] keyPrefixs, String queryKey, String queryValue);

	Set<ZNode> refresh();

	void changeRefreshMode(String mode);

	void changeShowType(String state);

	void refreshAllKeys();

}
