/**
 * 
 */
package com.sle.onlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author VISHAL
 *
 */

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){	
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksHome", true);
		mv.addObject("title", "Home");
		
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about(){	
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksAbout", true);
		mv.addObject("title", "About Us");
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact(){	
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksContact", true);
		mv.addObject("title", "Contact Us");
		return mv;
	}
	
	@RequestMapping(value = "/listProducts")
	public ModelAndView ListProducts(){	
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksListProducts", true);
		mv.addObject("title", "Our Products");
		return mv;
	}
	
	

	
	/*@RequestMapping(value = {"/test"})
	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting){
		if(greeting == null){
			greeting = "Hello!";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	
	@RequestMapping(value = {"/test/{greeting}"})
	public ModelAndView test(@PathVariable(value = "greeting") String greeting){
		if(greeting == null){
			greeting = "Hello!";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	
}
