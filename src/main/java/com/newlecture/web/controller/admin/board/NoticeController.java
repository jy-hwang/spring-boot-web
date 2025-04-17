package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

  // list, detail, edit, reg

  @GetMapping("list")
  public String listPage() {
    
    return "admin/board/notice/list";
  }
  
  @GetMapping("detail")
  public String detailPage() {
    
    return "admin/board/notice/detail";
  }
  
  @GetMapping("edit")
  public String editPage() {
    
    return "admin/board/notice/edit";
  }
  
  @GetMapping("reg")
  public String regPage() {
    
    return "admin/board/notice/reg";
  }
}
