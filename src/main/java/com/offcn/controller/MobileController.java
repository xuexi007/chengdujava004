package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.po.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {
@Autowired
MobileService service;

    @RequestMapping("/mobilesearch")
	public String findMobile(String mobilenumber,Model model){
		Mobile m=null;
		
		m=service.findMobile(mobilenumber);
		
		if(m!=null){
			model.addAttribute("msg", "号码:"+mobilenumber+" 归属于:"+m.getMobilearea()+" "+m.getMobiletype());
		}else{
			model.addAttribute("msg", "号码:"+mobilenumber+"在号段库中不存在");
		}
		
		return "result";
		
	}
}
