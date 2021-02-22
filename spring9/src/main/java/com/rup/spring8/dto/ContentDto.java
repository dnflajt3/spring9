package com.rup.spring8.dto;

public class ContentDto {

	private int mId;
	private String mWriter;
	private String mContent;
	
	public ContentDto() {
		
	}

	public ContentDto(int mId, String mWriter, String mContent) {
		super();
		this.mId = mId;
		this.mWriter = mWriter;
		this.mContent = mContent;
	}

	public int getmId() {
		return mId;
	}

	public String getmWriter() {
		return mWriter;
	}

	public String getmContent() {
		return mContent;
	}
	
	
	
	
}
