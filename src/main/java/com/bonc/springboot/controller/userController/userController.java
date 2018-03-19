package com.bonc.springboot.controller.userController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bonc.springboot.ControllerAdvice.ExceptionMy;
import com.bonc.springboot.Model.UserEntity;

@RestController
@RequestMapping("/user")
public class userController {
	 @Value("${sp.name}")
	 private  String name;
	 
	 @RequestMapping(value="/select",method=RequestMethod.GET)
	 public String selectUser(@RequestParam(value="userName",required=false,defaultValue="张三") String userName,Model model){
		
		 
		 UserEntity userEntity=new UserEntity();
		 model.addAttribute("name","返回的名字");
		 model.addAttribute("user",userEntity);
		//int mat=1/0;
		 //throw new ExceptionMy("100","自定义异常");
		 return this.name;
	 }
  
}
