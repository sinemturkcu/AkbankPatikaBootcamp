import entity.Customer;
import service.CustomerService;
import service.OrderService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CustomerService
        CustomerService customerService = new CustomerService();

        // Create an instance of OrderService with an empty list of orders and the customer service
        OrderService orderService = new OrderService(customerService);

        // Create a new customer and add it to the customer service
        Customer customer = new Customer("Ömer", "Oruç", 24, "Haziran");
        customerService.addCustomer(customer);

        // Print all customers
        System.out.println(customerService.getAllCustomers());
        System.out.println("****************************************");

        // Print customers with names containing the letter 'c'
        System.out.println(customerService.getCustomersWithNameContainingLetter("c"));
        System.out.println("****************************************");

        // Calculate the total amount of invoices for orders placed in June
        System.out.println(orderService.getTotalAmountOfJuneOrders());
        System.out.println("****************************************");

        // Calculate the average amount of high-value invoices (above 1500TL)
        System.out.println(orderService.getAverageHighValueInvoiceAmount());
        System.out.println("****************************************");

        // Get the list of high-value invoices (above 1500TL)
        System.out.println(orderService.getHighValueInvoices());
        System.out.println("****************************************");

        // Get the names of customers who have low-value invoices (below 500TL)
        System.out.println(orderService.getCustomersWithLowValueInvoices());
        System.out.println("****************************************");

        // Get all invoices
        System.out.println(orderService.getAllInvoices());
    }
}
