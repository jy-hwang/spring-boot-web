package com.newlecture.web.service;

import java.util.List;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {

  // 페이지를 요청할 때
  List<NoticeView> getViewList(boolean disclose);

  // 검색을 요청할 때
  List<NoticeView> getViewList(String field, String keyword, boolean disclose);

  // 페이지를 요청할 때
  List<NoticeView> getViewList(int page, String field, String keyword, boolean disclose);

  int getCount();

  int getCount(String field, String keyword, boolean isDisclose);

  // 자세한 페이지 요청할 때
  NoticeView getView(int no);

  Notice getNext(int no);

  Notice getPrev(int no);

  // - 수정 페이지를 요청할 때
  int update(Notice notice);

  int delete(int no);

  int insert(Notice notice);
  
  // 일괄공개를 요청할 때
  int updateDiscloseAll(int[] discloseNos, int[] closeNos);
  //int updateDiscloseAll(int[] nos, boolean isDisclose);
  // 일괄삭제를 요청할 때
  int deleteAll(int[] ids);

}
