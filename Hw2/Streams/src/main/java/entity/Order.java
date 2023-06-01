package entity;

import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    private int id;
    private double price;
    private String orderDate;
    private Customer customer;
    private String industry;


    public Order(int id, double price, Customer customer,String orderDate,String industry) {
        this.id = atomicInteger.incrementAndGet();
        this.price = price;
        this.customer = customer;
        this.orderDate=orderDate;
        this.industry=industry;
    }

    public Order(double price, Customer customer,String orderDate,String industry) {
        this.price = price;
        this.customer = customer;
        this.orderDate=orderDate;
        this.industry=industry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getIndustry() {
        return industry;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", orderDate='" + orderDate + '\'' +
                ", customer=" + customer +
                ", industry='" + industry + '\'' +
                '}';
    }
}
