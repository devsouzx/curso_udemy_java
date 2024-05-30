package sections.section18.solucao_problema;

import sections.section18.solucao_problema.entities.CarRental;
import sections.section18.solucao_problema.entities.Invoice;
import sections.section18.solucao_problema.entities.Vehicle;
import sections.section18.solucao_problema.services.BrazilTaxService;
import sections.section18.solucao_problema.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.println("Entre com os dados do aluguel");
    System.out.print("Modelo do carro: ");
    String carModel = sc.nextLine();
    System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
    System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

    System.out.print("Entre com o preço por hora: ");
    Double pricePerHour = sc.nextDouble();
    System.out.print("Entre com o preço por dia: ");
    Double pricePerDay = sc.nextDouble();

    RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

    rentalService.processInvoice(carRental);

    System.out.println("FATURA:");
    System.out.println("Pagamento basico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
    System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
    System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

    sc.close();
  }
}
