package com.nouvolution.shipman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testUiController {
	@RequestMapping("/testUi.do")
	public String dashBord() {
		return "testUi/testUi";
	}
}
