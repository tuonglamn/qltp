/**
 * 
 */
package com.lam.qltp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LamNguyen
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
}
