package sections.section18.exercise.services;

public interface OnlinePaymentService {
  double paymentFee(double amount);
  double interest(double amount, int months);
}
