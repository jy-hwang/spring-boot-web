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
  public List<NoticeView> getViewList(boolean disclose) {

    return getViewList(1, "title", "", disclose);
  }

  @Override
  public List<NoticeView> getViewList(String field, String keyword, boolean disclose) {

    return getViewList(1, field, keyword, disclose);
  }

  @Override
  public List<NoticeView> getViewList(int page, String field, String keyword, boolean disclose) {
    int size = 10;
    int offset = (page - 1) * size;

    List<NoticeView> list = noticeDao.getViewList(offset, size, field, keyword, disclose);

    return list;
  }

  @Override
  public int getCount() {

    return getCount("title", "", true);
  }

  @Override
  public int getCount(String field, String keyword, boolean isDisclose) {

    return noticeDao.getCount(field, "", isDisclose);
  }

  @Override
  public NoticeView getView(int id) {
    NoticeView notice = noticeDao.getView(id);

    return notice;
  }

  @Override
  public Notice getNext(int no) {

    return noticeDao.getNext(no);
  }

  @Override
  public Notice getPrev(int no) {

    return noticeDao.getPrev(no);
  }

  @Override
  public int update(Notice notice) {

    return noticeDao.update(notice);
  }

  @Override
  public int delete(int no) {

    return noticeDao.delete(no);
  }

  @Override
  public int insert(Notice notice) {

    return noticeDao.insert(notice);
  }


  @Override
  public int updateDiscloseAll(int[] discloseNos, int[] closeNos) {
    int result = 0;
    
    result += noticeDao.updateDiscloseAll(discloseNos, true);
    result += noticeDao.updateDiscloseAll(closeNos, false);
    
    return result;
  }


  @Override
  public int deleteAll(int[] nos) {

    return noticeDao.deleteAll(nos);
  }

}
