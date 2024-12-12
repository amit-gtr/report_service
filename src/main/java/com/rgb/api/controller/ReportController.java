package com.rgb.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rgb.api.request.SearchRequest;
import com.rgb.api.service.ReportService;

@Controller
public class ReportController {
	@Autowired
	private ReportService service;
	
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		
		model.addAttribute("search", new SearchRequest());
		model.addAttribute("name", service.getPlanName());
		model.addAttribute("status", service.getPlanStatuses());
		return "index";
	}
	
	
	
	
	

}
