package com.AmanB;

import java.time.LocalDate;

public class Test {
  public Test(){
//    TestFine();
//    TestBooks();
//    TestMembers();
    TestIssue();
  }

  private void TestIssue() {
    Member[] members = new Member[5];
    Book[] books = new Book[5];

    members[0] = new Member("Aman Bhargava", 1);
    members[1] = new Member("Prachi Bhargava", 2);
    members[2] = new Member("Srishti Choudhary", 3);
    members[3] = new Member("Rahul", 4);
    members[4] = new Member("Kartik", 5);

    books[0] = new Book("Journey", 1);
    books[1] = new Book("Journey 2", 2);
    books[2] = new Book("Journey 3", 3);
    books[3] = new Book("Journey 4", 4);
    books[4] = new Book("Journey 5", 5);
    IssueBook(books[1], members[3]);
    System.out.println(books[1].getTitle() + " is issued to : " + members[books[1].getIssuedTo()].getName());
    System.out.println(books[1].getTitle() + " was issued on " + books[1].getIssueDate() + " and is expected to be returned by : " + books[1].getExpectedReturnDate());
  }

  private void ReturnBook(Book book, Member member){
    book.setReturnDate(LocalDate.now().plusDays(6));
    member.setIssued(-1);
    book.setIssuedTo(-1);
  }

  private void TestMembers() {
    Member[] members = new Member[5];
    members[0] = new Member("Aman Bhargava", 1);
    members[1] = new Member("Prachi Bhargava", 2);
    members[2] = new Member("Srishti Choudhary", 3);
    members[3] = new Member("Rahul", 4);
    members[4] = new Member("Kartik", 5);
    for(Member member : members){
      System.out.println("Name of member is : " + member.getName());
    }
  }

  private void TestBooks() {
    Book[] books = new Book[5];
    books[0] = new Book("Journey", 1);
    books[1] = new Book("Journey 2", 2);
    books[2] = new Book("Journey 3", 3);
    books[3] = new Book("Journey 4", 4);
    books[4] = new Book("Journey 5", 5);
    for (Book book : books) {
      System.out.println("Name of book is : " + book.getTitle());
    }
  }

  private void TestFine() {
    LocalDate firstDate = LocalDate.now().minusDays(32);
    LocalDate secondDate = LocalDate.now();
    Fine fine = new Fine(firstDate, secondDate);
    System.out.println("Fine for " + fine.getNumberOfDays() + " days is : " + fine.getFine());
  }

  private static void IssueBook(Book book, Member member) {
    book.Issue(member.getId(), member);
  }
}
