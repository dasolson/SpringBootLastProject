package com.sist.web.vo;

import lombok.Data;

/*
 * 	NO				NUMBER
	CONTENTID		NUMBER
	USEFEE			VARCHAR2(1024 BYTE)
	SPENDTIME		VARCHAR2(1024 BYTE)
	PARKINGFEE		VARCHAR2(1024 BYTE)
	DISCOUNTINFO	VARCHAR2(1024 BYTE)
	INFOCENTER		VARCHAR2(1024 BYTE)
	USETIME			VARCHAR2(1024 BYTE)
	RESTDATE		VARCHAR2(1024 BYTE)
	PARKING			VARCHAR2(1024 BYTE)
	MSG				CLOB
 */
@Data
public class CurtureVO {
	private int no, contentid;
	private String usefee, spendtime, parkingfee, discountinfo, infocenter, usetime, restdate, parking, msg;
	
}
