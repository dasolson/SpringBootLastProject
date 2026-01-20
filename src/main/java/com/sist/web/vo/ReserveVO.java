package com.sist.web.vo;
/*
 *  	NO			NUMBER
		CNO			NUMBER
		ID			VARCHAR2(20 BYTE)
		RDAY		VARCHAR2(30 BYTE)
		RTIME		VARCHAR2(30 BYTE)
		RINWON		VARCHAR2(20 BYTE)
		REGDATE		DATE
		ISRESERVER	NUMBER
 */
import java.util.*;

import lombok.Data;
@Data
public class ReserveVO {
	private int no, cno, isreserve;
	private String id, rday, rtime, rinwon, dbday;
	private Date regdate;
	private SeoulVO svo = new SeoulVO();
}
