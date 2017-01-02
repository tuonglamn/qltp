/**
 * 
 */
package com.lam.qltp.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lam.qltp.models.PostModel;
import com.lam.qltp.services.PostService;

/**
 * @author LamNguyen
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private PostService postService;

	@RequestMapping("/")
	public String index(Model model){
		List<PostModel> latest5Posts = postService.findLatest5();
		model.addAttribute("latest5posts", latest5Posts);
		List<PostModel> latest3Posts = latest5Posts.stream()
		.limit(3).collect(Collectors.toList());
		model.addAttribute("latest3posts", latest3Posts);
		return "index";
	}
}
