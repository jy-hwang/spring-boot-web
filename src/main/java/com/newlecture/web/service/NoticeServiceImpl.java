package com.newlecture.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;

@Service
public class NoticeServiceImpl implements NoticeService {

  @Autowired
  private NoticeDao noticeDao;

  @Override
  public List<Notice> getList() {
    List<Notice> list = noticeDao.getList();

    return list;
  }

  @Override
  public Notice getOne(int id) {
    Notice notice = noticeDao.getOne(id);

    return notice;
  }

}
