package com.tcdt.qlnvluukho.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ListResponse<T> {
	private long total;
	private long count;
	private List<T> list = new ArrayList<>();

	public long getCount() {
		return this.list.size();
	}
}
