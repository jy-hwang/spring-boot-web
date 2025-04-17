package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/") 
public class NoticeController {

  @RequestMapping("list") // list, detail, edit, reg, del
  public String list(Model model) {
    model.addAttribute("test", "Hello!");

    return "/WEB-INF/views/customer/notice/list.jsp";
  }


  @RequestMapping("detail")
  public String detail() {
    
    return "/WEB-INF/views/customer/notice/detail.jsp";
  }

}
