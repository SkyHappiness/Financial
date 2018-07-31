package com.financial.enmu;

public enum Status {
	
	SUCCESS(1,"success"),
	FAIL(0,"fail");
	
	private int code;
	private String msg;
	
	private Status(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
}
