package com.newlecture.web.dao.mybatis;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Repository
public class MybatisNoticeDao implements NoticeDao{

  @Autowired
  private SqlSession sqlSession;
  
  @Override
  public List<NoticeView> getViewList(int offset, int size, String field, String keyword, boolean isDisclose) {
    NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);
    
    return noticeDao.getViewList(offset, size, field, keyword, isDisclose);
  }

  @Override
  public int getCount(String field, String string) {
    return 0;
  }

  @Override
  public NoticeView getView(int id) {
    return null;
  }

  @Override
  public Notice getNext(int no) {
    return null;
  }

  @Override
  public Notice getPrev(int no) {
    return null;
  }

  @Override
  public int update(Notice notice) {
    return 0;
  }

  @Override
  public int insert(Notice notice) {
    return 0;
  }

  @Override
  public int delete(int no) {
    return 0;
  }

  @Override
  public int updateDiscloseAll(int[] nos, boolean isDisclose) {
    return 0;
  }

  @Override
  public int deleteAll(int[] nos) {
    return 0;
  }
  
}
