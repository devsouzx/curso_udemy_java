package sections.section18.exercise.entities;

import java.time.LocalDate;

public class Installment {
  private LocalDate DueDate;
  private Double amount;

  public Installment(LocalDate dueDate, Double amount) {
    DueDate = dueDate;
    this.amount = amount;
  }

  public LocalDate getDueDate() {
    return DueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    DueDate = dueDate;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}
