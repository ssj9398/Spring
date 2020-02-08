package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.vo.UserVO;

@Controller
public class GetPostController {
	
	@RequestMapping(value="/create/{userid}/{name}/{gender}/{city}", method = RequestMethod.GET)
	public String confirm(@PathVariable String userid, 
									@PathVariable String name, 
									@PathVariable String gender,
									@PathVariable String city,
									Model model) {
		
		UserVO userVo = new UserVO(userid, name, gender, city);
		model.addAttribute("userVo", userVo);
		return "create";
	}
}
