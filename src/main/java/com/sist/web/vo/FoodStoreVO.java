package com.sist.web.vo;

import lombok.Data;

/*
 * 	NO			NUMBER
	CONTENTID	NUMBER
	FIRSTMENU	VARCHAR2(1024 BYTE)
	TREATMENU	VARCHAR2(1024 BYTE)
	INFOCENTER	VARCHAR2(1024 BYTE)
	PARKING		VARCHAR2(1024 BYTE)
	OPENDATE	VARCHAR2(1024 BYTE)
	OPENTIME	VARCHAR2(1024 BYTE)
	RESTDATE	VARCHAR2(1024 BYTE)
	MSG			CLOB
 */
@Data
public class FoodStoreVO {
	private int no, contentid;
	private String firstmenu, treatmenu, infocenter, parking, opendate, opentime, restdate, msg;
}
