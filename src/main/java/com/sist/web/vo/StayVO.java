package com.sist.web.vo;

import lombok.Data;

/*
 * 	NO	N			UMBER
	CONTENTID		NUMBER
	ROOMTYPE		VARCHAR2(1024 BYTE)
	CHECKINTIME		VARCHAR2(1024 BYTE)
	CHECKOUTTIME	VARCHAR2(1024 BYTE)
	CHKCOOKING		VARCHAR2(1024 BYTE)
	SUBFACILITY		VARCHAR2(1024 BYTE)
	FOODPLACE		VARCHAR2(1024 BYTE)
	RESERVATIONURL	VARCHAR2(1024 BYTE)
	INFOCENTER		VARCHAR2(1024 BYTE)
	PARKING			VARCHAR2(1024 BYTE)
	MSG				CLOB
 */
@Data
public class StayVO {
	private int no, contentid;
	private String roomtype, checkintime, chekeouttime, chkcooking, subfacility, foodplace, reservationurl, infocenter, parking, msg;
}
