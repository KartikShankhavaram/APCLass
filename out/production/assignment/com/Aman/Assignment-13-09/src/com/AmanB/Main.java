package com.AmanB;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
  private static Member[] members = new Member[100];
  private static Book[] books = new Book[100];
  private static int i=0;
  private static int j=0;
  public static void main(String[] args) {
//    Test test = new Test();
    Scanner sc=new Scanner(System.in);
    int answer;
    do{
      System.out.println("Welcome to Library Management System");
      System.out.println("1 : Add Book");
      System.out.println("2 : Add Member");
      System.out.println("3 : Issue a book");
      System.out.println("4 : Generate Bill");
      System.out.println("5 : Display list of members");
      System.out.println("6 : Display list of books");
      System.out.println("7 : Return a book");
      System.out.println("8 : Exit");
      answer = sc.nextInt();
      handleResponse(answer, sc);
    }while(answer !=8);
    sc.close();
  }

  private static void handleResponse(int answer, Scanner sc) {
    switch (answer){
      case 1 : AddBook(sc);
        break;
      case 2 : AddMember(sc);
        break;
      case 3 : IssueBook(sc);
        break;
      case 4 : PrintBill(sc);
        break;
      case 5 : DisplayMembers();
        break;
      case 6 : DisplayBooks();
        break;
      case 7 : ReturnBook(sc);
      break;
    }
  }

  private static void ReturnBook(Scanner sc) {
    System.out.println("Enter book id : ");
    int bookID = sc.nextInt();
    if(books[bookID-1].isIssued){
      books[bookID-1].ReturnBook(members[books[bookID-1].getIssuedTo()-1]);
      System.out.println("Book returned");
    }else
      System.out.println("Book is not issued");
  }

  private static void DisplayBooks() {
    System.out.println("Books are : ");
    int numberOfBooks = i;
    for(int j=0; j<numberOfBooks; j++){
      System.out.println(books[j].getTitle());
    }
  }

  private static void DisplayMembers() {
    System.out.println("Members are : ");
    int numberOfMembers = j;
    for(int i=0; i<numberOfMembers; i++){
      System.out.println(members[i].getName());
    }
  }

  private static void AddBook(Scanner sc) {
    System.out.println("Enter name of book");
    String title = sc.next();
    Book book = new Book(title, i+1);
    books[i] = book;
    i++;
    System.out.println("Book added ID : " + books[i-1].getBookID());
  }

  private static void AddMember(Scanner sc) {
    System.out.println("Enter name");
    String title = sc.next();
    Member member = new Member(title, j+1);
    members[j] = member;
    j++;
    System.out.println("Member added ID : " + members[j-1].getId());
  }

  private static void IssueBook(Scanner sc) {
    System.out.println("Enter member id");
    int id = sc.nextInt();
    if (members[id-1].canIssue) {
      System.out.println("Enter book id");
      int bookID = sc.nextInt();
      if (!books[bookID-1].isIssued) {
        books[bookID-1].Issue(id-1, members[id-1]);
      } else {
        System.out.println("Book has already been issued");
      }
    } else {
      System.out.println("Member has already issued a book");
    }
  }

  private static void PrintBill(Scanner sc) {
    int fine;
    int bill = 100;
    System.out.println("Enter member id");
    int id = sc.nextInt();
    Member member = members[id-1];
    if(member.getIssued()>0){
      Book book = books[member.getIssued()];
      fine = new Fine(book.getIssueDate(), book.getReturnDate()).getFine();
    }else{
      fine = 0;
    }
    bill += fine;
    System.out.println("Bill amount is : " + bill);
  }

}
