package com.sist.web.service;

import java.util.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sist.web.vo.*;

public interface CommonsReplyService {
	/*@Select("SELECT no, cno, id, name, msg, sex, "
			+ "TO_CHAR(regdate, 'yyyy-mm-dd hh24:mi:ss') as dbday, "
			+ "group_tab "
			+ "FROM commonsReply_3 "
			+ "WHERE cno = #{cno}"
			+ "ORDER BY group_id DESC, group_step ASC "
			+ "OFFSET #{start} ROWS FETCH NEXT 10 ROWS ONLY")*/
	public List<CommonsReplyVO> commonsReplyListData(int cno, int start);
	
	/*@Select("SELECT CEIL(COUNT(*)/10.0) "
			+ "FROM commonsReply_3 "
			+ "WHERE cno =#{cno}")*/
	public int commonsReplyTotalPage(int cno);
	
	/*@Insert("INSERT INTO commonsReply_3(no, cno, id, name, sex, msg, group_id) "
			+ "VALUES(cs3_no_seq.nextval, #{cno}, #{id}, #{name}, "
			+ "#{sex}, #{msg}, (SELECT NVL(MAX(group_id)+1, 1) FROM commonsReply_3))")*/
	public void commonsReplyInsert(CommonsReplyVO vo);
	
	public void commonsDelete(int no);
}
