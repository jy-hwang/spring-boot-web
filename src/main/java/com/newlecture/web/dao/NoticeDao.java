package com.newlecture.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
  //@Results({@Result(property = "memberName", column = "member_name")})
  @Select(" SELECT no, memberName, title, content, hit, createdDate FROM notice_view "
      + " WHERE ${field} LIKE '%${keyword}%' "
      + " ORDER BY createdDate DESC "
      + " LIMIT #{size} OFFSET #{offset} ")
  List<NoticeView> getList(int offset, int size, String field, String keyword);

  Notice getOne(int id);

}

