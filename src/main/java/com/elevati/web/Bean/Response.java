package com.elevati.web.Bean;

import java.util.List;

import org.springframework.http.HttpStatus;


public class Response {
	private HttpStatus statusCode;
	private Object responseBody;
	private List<?> list;
	private String message;
	public HttpStatus getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(HttpStatus ok) {
		this.statusCode = ok;
	}
	public Object getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
