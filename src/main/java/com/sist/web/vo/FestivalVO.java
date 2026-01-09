package com.sist.web.vo;

import lombok.Data;

/*
 * 	NO				NUMBER
	CONTENTID		NUMBER
	EVENTSTARTDATE	VARCHAR2(1024 BYTE)
	EVENTENDDATE	VARCHAR2(1024 BYTE)
	AGELIMIT		VARCHAR2(1024 BYTE)
	PLAYTIME		VARCHAR2(1024 BYTE)
	EVENTPLACE		VARCHAR2(1024 BYTE)
	EVENTHOMEPAGE	VARCHAR2(1024 BYTE)
	USETIME			VARCHAR2(1024 BYTE)
	SPENDTIME		VARCHAR2(1024 BYTE)
	MSG				CLOB
 */
@Data
public class FestivalVO {
	private int no, contentid;
	private String eventstartdate, eventenddate, agelimit, playtime, eventplace, eventhomepage, usetime, spendtime, msg;
}
