package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {

  @RequestMapping("/customer/notice/list") // list, detail, edit, reg, del
  public String list(Model model) {
    model.addAttribute("test", "Hello!");

    return "list.jsp";
  }


  @RequestMapping("/customer/notice/detail")
  public String detail() {
    
    return "detail.jsp";
  }

}
