package com.sist.web.service;
import com.sist.web.vo.MemberVO;

public interface MemberService {	
	public int memberidCheck(String userid);	
	public void memberInsert(MemberVO vo);
}
