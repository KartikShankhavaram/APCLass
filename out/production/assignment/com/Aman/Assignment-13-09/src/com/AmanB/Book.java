package com.AmanB;

import java.time.LocalDate;

public class Book {
  private LocalDate IssueDate;
  private LocalDate ExpectedReturnDate;
  private LocalDate ReturnDate;
  private String title;
  private int bookID;
  private int issuedTo;
  public Boolean isIssued;

  Book(String title, int bookId) {
    this.title = title;
    this.bookID = bookId;
    this.isIssued = false;
  }

  public String getTitle() {
    return title;
  }

  public int getBookID() {
    return bookID;
  }

  public void setIssuedTo(int issuedTo) {
    this.issuedTo = issuedTo;
  }

  public int getIssuedTo() {
    return issuedTo;
  }

  void Issue(int id, Member member) {
    member.setIssued(this.bookID);
    member.canIssue = false;
    this.setIssuedTo(id);
    this.isIssued = true;
    IssueDate = LocalDate.now();
    ExpectedReturnDate = LocalDate.now().plusDays(7);
  }

  LocalDate getIssueDate() {
    return IssueDate;
  }

  public LocalDate getExpectedReturnDate() {
    return ExpectedReturnDate;
  }

  public void ReturnBook(Member member){
    this.ReturnDate = LocalDate.now();
    this.isIssued = false;
    this.setIssuedTo(-1);
    member.setIssued(-1);
    member.canIssue = true;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.ReturnDate = returnDate;
  }

  LocalDate getReturnDate() {
    return ReturnDate;
  }
}
