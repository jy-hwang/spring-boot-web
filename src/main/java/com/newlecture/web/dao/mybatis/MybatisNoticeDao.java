package com.newlecture.web.dao.mybatis;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Repository
public class MybatisNoticeDao implements NoticeDao {

  private NoticeDao mapper;

  @Autowired
  public MybatisNoticeDao(SqlSession sqlSession) {
    mapper = sqlSession.getMapper(NoticeDao.class);
  }

  @Override
  public List<NoticeView> getViewList(int offset, int size, String field, String keyword, boolean isDisclose) {

    return mapper.getViewList(offset, size, field, keyword, isDisclose);
  }

  @Override
  public int getCount(String field, String string) {
    return mapper.getCount(field, string);
  }

  @Override
  public NoticeView getView(int id) {
    return mapper.getView(id);
  }

  @Override
  public Notice getNext(int no) {
    return mapper.getNext(no);
  }

  @Override
  public Notice getPrev(int no) {
    return mapper.getPrev(no);
  }

  @Override
  public int update(Notice notice) {
    return mapper.update(notice);
  }

  @Override
  public int insert(Notice notice) {
    return mapper.insert(notice);
  }

  @Override
  public int delete(int no) {
    return mapper.delete(no);
  }

  @Override
  public int updateDiscloseAll(int[] nos, boolean isDisclose) {
    return mapper.updateDiscloseAll(nos, isDisclose);
  }

  @Override
  public int deleteAll(int[] nos) {
    return mapper.deleteAll(nos);
  }

}
