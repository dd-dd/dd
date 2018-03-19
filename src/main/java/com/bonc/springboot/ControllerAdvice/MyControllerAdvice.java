package com.bonc.springboot.ControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerAdvice {
	//全局捕获异常，只要作用在RequestMapping方法上就会捕获所有的异常信息
	//真实的项目开发中用自定义异常
  @ResponseBody
  @ExceptionHandler(value=ExceptionMy.class)
  public Map<String,Object> errorHandler(ExceptionMy ex){
	  Map<String,Object> map=new HashMap<String,Object>();
	  map.put("code",ex.getCode());
	  map.put("msg",ex.getMsg());
	  return map;
  }
}
