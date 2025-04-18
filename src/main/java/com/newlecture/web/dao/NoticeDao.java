package com.newlecture.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.newlecture.web.entity.Notice;

@Mapper
public interface NoticeDao {

  @Select("SELECT no, member_no AS memberNo, title, content, hit, created_date AS createdDate FROM notice")
  List<Notice> getList();

  Notice getOne(int id);

}
