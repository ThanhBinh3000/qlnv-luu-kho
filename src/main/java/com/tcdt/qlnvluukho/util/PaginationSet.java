package com.tcdt.qlnvluukho.util;

public class PaginationSet {
	public static final int DEFAULT_LIMIT = 20;
	public static final int DEFAULT_PAGE = 0;

	public static int getPage(Integer page) {
		if (page != null) {
			return page;
		}
		return DEFAULT_PAGE;
	}

	public static int getLimit(Integer limit) {
		if (limit != null) {
			return limit;
		}
		return DEFAULT_LIMIT;
	}
}
