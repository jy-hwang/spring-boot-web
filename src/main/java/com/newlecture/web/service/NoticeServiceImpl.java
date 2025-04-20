package com.newlecture.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImpl implements NoticeService {

  @Autowired
  private NoticeDao noticeDao;

  @Override
  public List<NoticeView> getList(int page, String field, String keyword) {
    int size = 10;
    int offset = (page - 1) * size;
    List<NoticeView> list = noticeDao.getList(offset, size, field, keyword);

    return list;
  }

  @Override
  public Notice getOne(int id) {
    Notice notice = noticeDao.getOne(id);

    return notice;
  }

}
