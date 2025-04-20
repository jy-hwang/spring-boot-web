package com.newlecture.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
  //@Results({@Result(property = "memberName", column = "member_name")})
  @Select("SELECT no, name as memberName, title, content, hit, createDate FROM notice_view")
  List<NoticeView> getList();

  Notice getOne(int id);

}

