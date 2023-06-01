package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    private int id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String registerDate;

    private List<Order> orders = new ArrayList<>();

    public Customer(String firstName, String lastName, Integer age, String registerDate, List<Order> orders) {
        this.id = atomicInteger.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.registerDate = registerDate;
        this.orders = orders;
    }

    public Customer(String firstName, String lastName, Integer age, String registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.registerDate = registerDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", registerDate='" + registerDate + '\'' +
                '}';
    }
}
