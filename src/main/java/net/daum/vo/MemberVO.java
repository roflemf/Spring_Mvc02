package net.daum.vo;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

@Data //setter(),getter(),toString() 메서드 자동 제공
public class MemberVO {//데이터 저장빈 클래스
	
	private String userid; //회원 아이디
	private String userpw; //회원 비번
	private String userName; //회원 이름 =>userName, regDate, updateDate 빈클래스 변수명은 해당 테이블 컬럼명과 다르다
	private boolean enabled;
	
	private Timestamp regDate; //가입 날짜
	private Timestamp updateDate; //수정 날짜
	private List<AuthVO> authList; //권한리스트
}
