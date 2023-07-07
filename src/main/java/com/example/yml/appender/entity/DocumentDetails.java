package com.example.yml.appender.entity;

/**
 * 
 * @author cnila
 *
 */
public class DocumentDetails {
	private String serialNumber;
	private String documentId;
	private String pendStatus;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getPendStatus() {
		return pendStatus;
	}
	public void setPendStatus(String pendStatus) {
		this.pendStatus = pendStatus;
	}
}
