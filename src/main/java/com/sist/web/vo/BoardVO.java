package com.sist.web.vo;
/*
 * 	NO		NUMBER
	NAME	VARCHAR2(51 BYTE)
	SUBJECT	VARCHAR2(4000 BYTE)
	CONTENT	CLOB
	PWD		VARCHAR2(10 BYTE)
	REGDATE	DATE
	HIT		NUMBER
 */
// CRUD => 모든 사이트 필수 : 댓글 (옵션)
import java.util.*;

import lombok.Data;
@Data
public class BoardVO {
	private int no, hit, replycount;
	private String name, subject, content, dbday, pwd;
	private Date regdate;
}
