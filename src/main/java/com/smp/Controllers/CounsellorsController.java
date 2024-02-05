package com.smp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smp.entity.Counseller;
import com.smp.services.CounsellorService;

@RestController
public class CounsellorsController {
	
	@Autowired
	private CounsellorService counsellorService;
	
	@GetMapping("/dashboard")
	public String buildDashboard(Model model) {
		
		return "dashboard";
	}
	
	// display login page
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("Counseller", new Counseller()  );
		return "loginView";
	} 
	
	@SuppressWarnings("unused")
	@PostMapping("/login")
	public String handleLogin(Counseller c, Model model) {
		Counseller objCounseller = counsellorService.loginCheck(c.getEmail(), c.getPassword());
		if (objCounseller== null) {
			model.addAttribute("errmsg", "Invalid cred");
			return "loginView";
		}
		return "redirect:dashboard";
	}

	// display signup page 
	@GetMapping("/register")
	public String regPage(Model model) {
		model.addAttribute("Counseller", new Counseller()  );

		return "regView";
	} 
	
	@PostMapping("/register")
	public String handleRegistration(Counseller c, Model model) {
	String msg = counsellorService.saveCounsellor(c);
	model.addAttribute("msg", msg);
		return "regView";
	}

	// display fpwd page
	@GetMapping("/forget_pwd")
	public String recoverPwdPage(Model model) {	
		return "forgetPwdView";
	} 




	@GetMapping("/recover_pwd")
	public String handleForgotPwd(@RequestParam String email, Model model) {
		boolean status = counsellorService.recoverPwd(email);
		if (status) {
			model.addAttribute("smsg", "pwd send to email");
		}else {
			model.addAttribute("errmsg", "InvalidEmail");
		}
		return "forgetPwdView";
	}

	

}
