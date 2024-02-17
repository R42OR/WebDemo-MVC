package com.example.controller;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/message")
	public ModelAndView showMessage() {
		
		ModelAndView mav = new ModelAndView();
		String clock = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
		LocalDateTime clock2 = LocalDateTime.now();
		mav.addObject("mssg", "This is a Demo Message");
		mav.addObject("time", clock);
		mav.addObject("time2",clock2);
		
		
		mav.setViewName("demo");
		
		return mav;
		
	}

}
