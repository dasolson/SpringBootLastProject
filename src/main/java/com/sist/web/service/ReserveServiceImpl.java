package com.sist.web.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.sist.web.mapper.*;
import com.sist.web.vo.*;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ReserveServiceImpl implements ReserveService{
	private final ReserveMapper mapper;

	@Override
	public List<SeoulVO> seoulReserveData(Map map) {
		// TODO Auto-generated method stub
		return mapper.seoulReserveData(map);
	}

	@Override
	public int seoulReserveTotalPage(Map map) {
		// TODO Auto-generated method stub
		return mapper.seoulReserveTotalPage(map);
	}

	@Override
	public String reserveInsert(ReserveVO vo) {
		// TODO Auto-generated method stub
		String res = "";
		try {
			mapper.reserveInsert(vo);
			res = "YES";
		} catch (Exception e) {
			res = "NO";
		}
		return res;
	}

	@Override
	public List<ReserveVO> reserveMyData(String id) {
		// TODO Auto-generated method stub
		return mapper.reserveMyData(id);
	}

	@Override
	public List<ReserveVO> reserveAdminData() {
		// TODO Auto-generated method stub
		return mapper.reserveAdminData();
	}
}
