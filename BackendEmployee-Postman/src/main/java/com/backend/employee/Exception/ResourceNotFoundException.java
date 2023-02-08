package com.backend.employee.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String source;
	private  String sourceName;
	private Object value;
	
	public ResourceNotFoundException(String source, String sourceName, Object value) {
		super(String.format("%s not found on %s : '%s'",source,sourceName,value));
		this.source = source;
		this.sourceName = sourceName;
		this.value = value;
	}
	
	public String getSource() {
		return source;
	}
	
	public String getSourceName() {
		return sourceName;
	}
	
	public Object getValue() {
		return value;
	}

}
