package com.newlecture.web.controller.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice")
public class NoticeController {

  @Autowired
  private NoticeService noticeService;

  @GetMapping("/list") // list, detail, edit, reg, del
  public String list(Model model) {
    int page = 1;
    String field = "title";
    String keyword = "";
    
    List<NoticeView> list = noticeService.getViewList(page, field, keyword);
    model.addAttribute("list", list);
    // return "customer/notice/list"; // ResourceViewResolver
    return "customer.notice.list"; // TilesViewResolver
  }

  @GetMapping("/detail")
  public String detail() {

    return "customer.notice.detail";
  }

}
