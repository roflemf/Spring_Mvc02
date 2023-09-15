package net.daum.security;

import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomNoOpPasswordEncoder implements PasswordEncoder {//비번 암호화 클래스

	@Override
	public String encode(CharSequence rawPassword) {
		return rawPassword.toString();
	}//암호화 되기 전 비번을 문자열로 반환

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {

		return rawPassword.toString().equals(encodedPassword);//문자열 내용만 비교해서 참이면 참 반환 (내부적으로 암호화 된것도 비교가능)
	}//암호화 되기 전 비번과 암호화 된 비번 내용물 같은지 비교

}
