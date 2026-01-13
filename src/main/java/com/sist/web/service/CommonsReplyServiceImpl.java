package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;
/*
 *     Service    : DataBase, OpenAPI, AI => 요청 처리 => Back-End의 중심
 *         => Security : BI
 *     Repository : 오라클 / MySQL 연동
 *         | DispatcherServlet : 요청 / 응답 => FrontController     
 *     Controller : 결과값을 받아서 브라우저로 전송
 *         | Front-End => 조립 => 결과값 추출
 *     ---------------------------------------------------------------    
 *     Component  : 기타    
 *         | AOP / Task / Batch
 *         
 *     = Controller     : Router 역할
 *     = RestController : 데이터 전송
 *     
 *        Server ===== Client 
 *           |
 *        서버 역할만 (화면제어가 없다) => Front에서 자체 처리 
 *                                  router => Vue / React 
 *                                  
 *          var / val  fun 함수명() : String => data class Sawon(int age)
 *                                            ---- vo                        
 */
import org.springframework.transaction.annotation.Transactional;

import com.sist.web.mapper.CommonsReplyMapper;
import com.sist.web.vo.CommonsReplyVO;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CommonsReplyServiceImpl implements CommonsReplyService{
	private final CommonsReplyMapper mapper;

	@Override
	public List<CommonsReplyVO> commonsReplyListData(int cno, int start) {
		// TODO Auto-generated method stub
		return mapper.commonsReplyListData(cno, start);
	}

	@Override
	public int commonsReplyTotalPage(int cno) {
		// TODO Auto-generated method stub
		return mapper.commonsReplyTotalPage(cno);
	}

	@Override
	public void commonsReplyInsert(CommonsReplyVO vo) {
		// TODO Auto-generated method stub
		mapper.commonsReplyInsert(vo);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void commonsDelete(int no) {
		// TODO Auto-generated method stub
		CommonsReplyVO vo = mapper.commonsInfoData(no);
		if(vo.getDepth() == 0) {
			mapper.commonsDelete(no);
		}else {
			CommonsReplyVO rvo = new CommonsReplyVO();
			rvo.setNo(no);
			rvo.setMsg("관리자에 의해 삭제되었습니다.");
			mapper.commonsMsgUpdate(rvo);
		}
		mapper.commonstDepthDecrement(vo.getRoot());
	}
	
	
}
