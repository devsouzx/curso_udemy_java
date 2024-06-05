package sections.section18.exercise;

import sections.section18.exercise.entities.Contract;
import sections.section18.exercise.entities.Installment;
import sections.section18.exercise.services.ContractService;
import sections.section18.exercise.services.PayPalService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Entre os dados do contrato:");
    System.out.print("Numero: ");
    int contractNumber = sc.nextInt();
    sc.nextLine();
    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate contractDate = LocalDate.parse(sc.nextLine(), fmt);
    System.out.print("Valor do contrato: ");
    double contractValue = sc.nextDouble();
    System.out.print("Entre com o numero de parcelas: ");
    int numberOfInterests = sc.nextInt();
    sc.nextLine();

    Contract contract = new Contract(contractNumber, contractDate, contractValue);
    ContractService service = new ContractService(new PayPalService());
    service.processContract(contract, 3);

    System.out.println("Parcelas:");
    for (Installment installment: contract.getInstallments()) {
      System.out.println(fmt.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
    }
    sc.close();
  }
}
