package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j		//Simple Logging Facade for Javaの略
public class LogoutController {

	/** ログイン画面にリダイレクト */
	@PostMapping("/logout")
	public String postLogout() {
		log.info("ログアウト成功！");
		return "redirect:/login";
	}
}
