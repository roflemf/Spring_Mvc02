package net.daum.vo;

import lombok.Data;

@Data
public class AuthVO {//tbl_member_auth 테이블의 컬럼명과 일치하는 데이터 저장빈 클래스 생성
	
	private String userid; //외래키 제약조건으로 생성된 회원아이디
	private String auth; //권한이 저장된 컬럼

}
