package me.comiplae.springbootest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String springbootest() {
		return "GCI 2019!";
	}

}
