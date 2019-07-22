/*
 * @File TestAction.java
 * @Package com.more.mc.web
 * @Copyinght Copyright (c) 2019
 * @Company morelean
 * @author Administrator
 * @date 2019年7月16日 上午9:56:27
 * @version V1.0
 */

package com.more.mc.web;

import java.io.IOException;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport
{
  /*
  @Override
  public String execute()
    throws Exception
  {
    System.out.println("-----------------------------------------------------");
    return "list";
  }  
  */
  
  public String query() throws IOException{
    System.out.println("---------------------------aaa--------------------------");
    return "list";
  }
  
}
