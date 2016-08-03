package com.hybrid.fx.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hybrid.domain.MemberInfo;
@Controller
@RequestMapping("/member")
public class MemberController {
	static Logger log = LoggerFactory.getLogger(MemberController.class);
	@RequestMapping("/registForm")
	public String registForm() {
			log.info("############");
			log.info("registForm()");
			log.info("############");
			return "registForm";
		}
	@RequestMapping("/regist")
	public String regist(MemberInfo memberinfo) {
		log.info("############");
		log.info("regist()");
		log.info("############");
		log.info("memberid = " + memberinfo.getId());
		log.info("membername = " + memberinfo.getName());
		log.info("memberemail = " + memberinfo.getEmail());
		return "regist";
	}
}
