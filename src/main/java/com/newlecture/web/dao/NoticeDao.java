package com.newlecture.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {

  // select
  List<NoticeView> getViewList(int offset, int size, String field, String keyword);

  int getCount(String field, String string);

  NoticeView getView(int id);

  Notice getNext(int no);

  Notice getPrev(int no);

  // insert update
  int update(Notice notice);

  int insert(Notice notice);

  int delete(int no);

  int updateDiscloseAll(int[] discloseNos, int[] closeNos);

  int deleteAll(int[] nos);

}

