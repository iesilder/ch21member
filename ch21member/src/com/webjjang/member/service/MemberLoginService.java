package com.webjjang.member.service;

import com.webjjang.member.dao.MemberDAO;
import com.webjjang.member.dto.MemberDTO;
import com.webjjang.util.ServiceInterface;

public class MemberLoginService implements ServiceInterface {

	private MemberDAO memberDAO;
	// 오류를 유태선님께서 찾으셨습니다.
	@Override
	public void setDAO(Object obj) {this.memberDAO=(MemberDAO) obj;}
	
	@Override
	public Object excute(Object obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(getClass().getName()+".excute().memberDAO:"+memberDAO);
		MemberDTO memberDTO = memberDAO.login((MemberDTO) obj);
		System.out.println("MemberLoginService.excute().memberDTO:"+memberDTO);
		return memberDTO;
	}

}
