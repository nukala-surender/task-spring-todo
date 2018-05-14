package com.example.task.controller.models;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class ToDoModel {

	String id;
	String value;
	String status;
	boolean isUrgent;
	Date createdAt = new Date();
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isUrgent() {
		return isUrgent;
	}
	public void setUrgent(boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	
}
