package com.tcdt.qlnvluukho.response;

import lombok.Data;

@Data
public class BaseResponse {
	Object data;
	int statusCode;//0: succ <>0: fail
	String msg;
	Object included;
}