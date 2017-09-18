package com.AmanB;

public class Member {
  private String name;
  private int id;
  private int issued;
  public Boolean canIssue;

  Member(String name, int id) {
    this.name = name;
    this.id = id;
    this.canIssue = true;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  void setIssued(int issued) {
    this.issued = issued;
  }

  int getIssued() {
    return issued;
  }

}
