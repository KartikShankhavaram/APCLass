package com.AmanB;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

class Fine {
  private int amount;
  private long numberOfDays;
  public Fine(LocalDate IssueDate, LocalDate ReturnDate) {
    numberOfDays = diffInDays(IssueDate, ReturnDate);
    this.amount = calculateFine(numberOfDays);
  }

  private int calculateFine(long numberOfDays) {
    if (numberOfDays <= 7) {
      return 0;
    }
    else if(numberOfDays>7 && numberOfDays <=30){
      return (int) ((numberOfDays-7)*10);
    }
    else if (numberOfDays>30){
      return (int) (((30-7)*10)+(numberOfDays-30)*50);
    }
    return 0;
  }
  private long diffInDays(LocalDate IssueDate, LocalDate ReturnDate) {
    return DAYS.between(IssueDate, ReturnDate);
  }

  int getFine() {
    return amount;
  }

  public long getNumberOfDays() {
    return numberOfDays;
  }
}
