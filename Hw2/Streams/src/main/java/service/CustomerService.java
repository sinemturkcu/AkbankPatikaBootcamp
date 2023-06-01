package service;

import entity.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public CustomerService(){
        Customer customer = new Customer("Sinem","Türkçü",24,"Nisan");
        Customer customer1 = new Customer("Mertcan","Yaşar",20,"Mayıs");
        Customer customer2 = new Customer("Gizem","Gece",17,"Haziran");
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public List<Customer> getCustomersWithNameContainingLetter(String letter) {
        return customers.stream()
                .filter(customer -> customer.getFirstName().contains(letter) || customer.getLastName().contains(letter))
                .collect(Collectors.toList());
    }



}
