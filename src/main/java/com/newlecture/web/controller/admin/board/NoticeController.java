package com.newlecture.web.controller.admin.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.newlecture.web.entity.NoticeView;
import com.newlecture.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {

  @Autowired
  private NoticeService noticeService;

  // list, detail, edit, reg

  @GetMapping("list")
  public String listPage() {
    // List<Notice> list = noticeService.getList();

    return "admin.board.notice.list";
  }

  @GetMapping("detail")
  public String detailPage() {
    NoticeView notice = noticeService.getView(1);

    return "admin.board.notice.detail";
  }

  @GetMapping("edit")
  public String editPage() {

    return "admin.board.notice.edit";
  }

  @GetMapping("reg")
  public String regPage() {

    return "admin.board.notice.reg";
  }
}
