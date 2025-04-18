package com.newlecture.web.entity;

import java.util.Date;

public class NoticeView extends Notice {
  private String memberName;

  public NoticeView() {}

  public NoticeView(int no, int memberNo, String title, String content, int hit, String files, Date createdDate, Date updatedDate, Date deletedDate, boolean disclose, String memberName) {
    super(no, memberNo, title, content, hit, files, createdDate, updatedDate, deletedDate, disclose);
    this.memberName = memberName;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  @Override
  public String toString() {
    return "NoticeView [memberName=" + memberName + ", getNo()=" + getNo() + ", getMemberNo()=" + getMemberNo() + ", getTitle()=" + getTitle() + ", getContent()=" + getContent() + ", getHit()="
        + getHit() + ", getFiles()=" + getFiles() + ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedDate()=" + getUpdatedDate() + ", getDeletedDate()=" + getDeletedDate() + ", isDisclose()="
        + isDisclose() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
  }


}
