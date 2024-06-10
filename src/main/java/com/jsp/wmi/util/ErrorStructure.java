package com.jsp.wmi.util;

public class ErrorStructure<T> {
	private int status;
	private String message;
	private String rootCause;
	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public String getRootCause() {
		return rootCause;
	}

	public ErrorStructure<T> setStatus(int status) {
		this.status = status;
		return this;
	}

	public ErrorStructure<T>setMessage(String message) {
		this.message = message;
		return this;
	}

	public ErrorStructure<T>setRootCause(String rootCause) {
		this.rootCause = rootCause;
		return this;
	}



}
