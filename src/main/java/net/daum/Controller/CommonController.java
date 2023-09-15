package net.daum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommonController {

	@GetMapping("/accessError") //403 접근금지 에러 발생시 실행되는 매핑주소
	public void accessDenied(Model model) {
		
		System.out.println("access Denied");
		model.addAttribute("msg", "Access Denied"); 
		//msg 키이름에 Access Denied 값 저장
	}
	
	//커스텀 로그인 매핑주소
	@GetMapping("/customLogin")//return 타입 없는void 형; customLogin이 매핑주소
	public void cusotmLogin(String error, String logout, Model model) {
		System.out.println("error: " + error);
		System.out.println("logout: " + logout);
		
		if(error != null) {
			model.addAttribute("error", "Login Error Check Your Account");
		}
		
		if(logout != null) {
			model.addAttribute("logout", "Logout!!");
		}
	}//customLogin()
	
	
	//get방식 로그아웃 처리하는 페이지로 이동
	@GetMapping("/customLogout") //매핑주소가 뷰페이지 파일명
	public void logoutGet() {
		
	}
	
	//post방식 로그아웃
	@PostMapping("/customLogout")
	public void logoutPost() {
		
	}
}
