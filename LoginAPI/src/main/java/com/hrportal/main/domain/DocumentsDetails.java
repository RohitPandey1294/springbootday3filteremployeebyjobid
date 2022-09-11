package com.hrportal.main.domain;

import java.util.Arrays;
import java.util.Objects;

public class DocumentsDetails {

	private String docId;
	private String docName;
	private String docType;
	private byte[] uploadedFile;

	public DocumentsDetails() {
		// TODO Auto-generated constructor stub
	}

	public DocumentsDetails(String docId, String docName, String docType, byte[] uploadedFile) {
		super();
		this.docId = docId;
		this.docName = docName;
		this.docType = docType;
		this.uploadedFile = uploadedFile;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getUploadedFile() {
		return uploadedFile;
	}

	public void setUploadedFile(byte[] uploadedFile) {
		this.uploadedFile = uploadedFile;
	}

	@Override
	public String toString() {
		return "DocumentsDetails [docId=" + docId + ", docName=" + docName + ", docType=" + docType + ", uploadedFile="
				+ Arrays.toString(uploadedFile) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(uploadedFile);
		result = prime * result + Objects.hash(docId, docName, docType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentsDetails other = (DocumentsDetails) obj;
		return Objects.equals(docId, other.docId) && Objects.equals(docName, other.docName)
				&& Objects.equals(docType, other.docType) && Arrays.equals(uploadedFile, other.uploadedFile);
	}

}
