package sections.section13;

import sections.section13.entities.Order;
import sections.section13.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Enumeracao {
  public static void main(String[] args) {
    Order order = new Order(5273, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

    System.out.println(order);

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    System.out.println(os1);
    System.out.println(os2);
  }
}
