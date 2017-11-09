package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PojoClass {

	private Payload payload;
	
	@JsonIgnore
	private boolean success;
	

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
