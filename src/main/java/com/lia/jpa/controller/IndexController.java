package com.lia.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(){
		return "/WEB-INF/jsp/index.jsp";
	}
}
