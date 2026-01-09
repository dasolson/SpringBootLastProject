package com.sist.web.vo;

import lombok.Data;

/*
 * 	NO				NUMBER
	CONTENTID		NUMBER
	SALEITEM		VARCHAR2(1024 BYTE)
	SALEITEMCOST	VARCHAR2(1024 BYTE)
	FAIRDAY	        VARCHAR2(1024 BYTE)
	INFOCENTER		VARCHAR2(1024 BYTE)
	RESTDATE		VARCHAR2(1024 BYTE)
	PARKING			VARCHAR2(1024 BYTE)
	OPENTIME		VARCHAR2(1024 BYTE)
	MSG				CLOB
 */
@Data
public class ShoppingVO {
	private int no, contentid;
	private String saleitem, saleitemcost, fairday, infocenter, restdate, parking, opentime, msg;
}
