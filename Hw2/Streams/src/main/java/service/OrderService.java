package service;

import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public OrderService(List<Order> orders, CustomerService customerService) {

        Order order1 = new Order(1800.0, customerService.getAllCustomers().get(0), "Haziran ", "Industry A");
        Order order2 = new Order(200.0, customerService.getAllCustomers().get(1), "Temmuz", "Industry B");
        Order order3 = new Order(300.0, customerService.getAllCustomers().get(2), "Haziran", "Industry C");

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

    }

        public void addOrder(Order order) {
            orders.add(order);
        }

        public double getTotalAmountOfJuneOrders() {
            return orders.stream()
                    .filter(order -> order.getOrderDate().equals("Haziran"))
                    .mapToDouble(Order::getPrice)
                    .sum();
        }

        public double getAverageHighValueInvoiceAmount() {
            List<Order> highValueInvoices = orders.stream()
                    .filter(order -> order.getPrice() > 1500.0)
                    .collect(Collectors.toList());

            if (highValueInvoices.isEmpty()) {
                return 0.0;
            }

            double totalAmount = highValueInvoices.stream()
                    .mapToDouble(Order::getPrice)
                    .sum();

            return totalAmount / highValueInvoices.size();
        }

        public List<Order> getHighValueInvoices() {
            return orders.stream()
                    .filter(order -> order.getPrice() > 1500.0)
                    .collect(Collectors.toList());
        }

        public List<Customer> getCustomersWithLowValueInvoices() {
            List<Order> lowValueInvoices = orders.stream()
                    .filter(order -> order.getPrice() < 500.0)
                    .collect(Collectors.toList());

            return lowValueInvoices.stream()
                    .map(Order::getCustomer)
                    .collect(Collectors.toList());
        }

        public List<Order> getAllInvoices() {
            return orders;
        }
    }


