package com.tcdt.qlnvluukho.util;

import com.tcdt.qlnvluukho.service.SecurityContextService;
import com.tcdt.qlnvluukho.table.UserInfo;

public class UserUtils {
	public static UserInfo getUserInfo() throws Exception {
		UserInfo userInfo = SecurityContextService.getUser();
		if (userInfo == null) throw new Exception("Can not get user info");

		return userInfo;
	}

}
