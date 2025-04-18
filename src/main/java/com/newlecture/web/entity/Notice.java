package com.newlecture.web.entity;

import java.util.Date;

public class Notice {

  private int no;
  
  private int memberNo;
  
  private String title;
  
  private String content;
  
  private int hit;
  
  private String files;
  
  private Date createdDate;
  
  private Date updatedDate;
  
  private Date deletedDate;
  
  private boolean disclose;
  
  public Notice () {}

  public Notice(int no, int memberNo, String title, String content, int hit, String files, Date createdDate, Date updatedDate, Date deletedDate, boolean disclose) {
    super();
    this.no = no;
    this.memberNo = memberNo;
    this.title = title;
    this.content = content;
    this.hit = hit;
    this.files = files;
    this.createdDate = createdDate;
    this.updatedDate = updatedDate;
    this.deletedDate = deletedDate;
    this.disclose = disclose;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(int memberNo) {
    this.memberNo = memberNo;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getHit() {
    return hit;
  }

  public void setHit(int hit) {
    this.hit = hit;
  }

  public String getFiles() {
    return files;
  }

  public void setFiles(String files) {
    this.files = files;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  public Date getDeletedDate() {
    return deletedDate;
  }

  public void setDeletedDate(Date deletedDate) {
    this.deletedDate = deletedDate;
  }

  public boolean isDisclose() {
    return disclose;
  }

  public void setDisclose(boolean disclose) {
    this.disclose = disclose;
  }

  @Override
  public String toString() {
    return "Notice [no=" + no + ", memberNo=" + memberNo + ", title=" + title + ", content=" + content + ", hit=" + hit + ", files=" + files + ", createdDate=" + createdDate + ", updatedDate="
        + updatedDate + ", deletedDate=" + deletedDate + ", disclose=" + disclose + "]";
  }
  
}
