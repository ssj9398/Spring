package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dao.UserDao;
import com.example.vo.UserVO;

@Controller
public class MainController {
	@Autowired
	private UserDao userDao;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/user")
	public String insert(UserVO userVO) {
		this.userDao.create(userVO);
		return "redirect:/user";
	}

	@GetMapping("/user")
	public String list(Model model) {
		model.addAttribute("users", this.userDao.readAll());
		return "list";
	}
}
