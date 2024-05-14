package sections.section13.entities;

import sections.section13.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
  private Integer id;
  private LocalDateTime moment;
  private OrderStatus status;

  public Order(Integer id, LocalDateTime moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getMoment() {
    return moment;
  }

  public void setMoment(LocalDateTime moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Order{" +
            "id=" + id +
            ", moment=" + moment +
            ", status=" + status +
            '}';
  }
}
