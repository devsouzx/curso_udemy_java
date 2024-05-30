package sections.section18.exercise.services;

import sections.section18.exercise.entities.Contract;
import sections.section18.exercise.entities.Installment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContractService {
  private OnlinePaymentService onlinePaymentService;

  public ContractService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public OnlinePaymentService getOnlinePaymentService() {
    return onlinePaymentService;
  }

  public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
    this.onlinePaymentService = onlinePaymentService;
  }

  public void processContract(Contract contract, int months) {
    double v = contract.getTotalValue() / months;

    List<Installment> list = new ArrayList<>();
    for (int i = 1; i <= months; i++) {
      double result = v + onlinePaymentService.interest(v, i);
      result += onlinePaymentService.paymentFee(result);
      LocalDate d = contract.getDate().plusMonths(i);
      list.add(new Installment(d, result));
    }

    contract.setInstallments(list);
  }
}
