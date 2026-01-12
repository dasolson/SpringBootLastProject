package com.sist.web.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.sist.web.vo.*;
@Mapper
@Repository
public interface BoardReplyMapper {
	@Select("SELECT no, bno, id, name, sex, msg, TO_CHAR(regdate,'yyyy-MM-dd hh24:mi:ss') as dbday "
			+ "FROM board_reply_3 "
			+ "WHERE bno = #{bno}")
	public List<BoardReplyVO> boardReplyListData(int bno);
	
	@Select("SELECT COUNT(*) FROM board_reply_3 "
			+ "WHERE bno = #{bno}")
	public int boardReplyCount(int bno);
	
	@Insert("INSERT INTO board_reply_3 VALUES("
			+ "br3_no_seq.nextval, #{bno}, #{id}, #{name}, #{sex}, #{msg}, SYSDATE)")
	public void boardReplyInsert(BoardReplyVO vo);
	
	@Delete("DELETE FROM board_reply_3 "
			+ "WHERE no = #{no}")
	public void boardReplyDelete(int no);
}
