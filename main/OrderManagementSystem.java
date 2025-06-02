// Sample OOP Java Program for Order Management

import java.util.*;

interface PaymentMethod {
    void processPayment(double amount);
}

// Concrete implementation of PaymentMethod
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " using card: " + cardNumber);
    }
}

class Order {
    private static int nextOrderId = 1;

    private int orderId;
    private String customerName;
    private List<String> items;
    private double totalAmount;

    public Order(String customerName) {
        this.orderId = nextOrderId++;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addItem(String item, double price) {
        items.add(item);
        totalAmount += price;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Items: " + items);
        System.out.println("Total: $" + totalAmount);
    }
}

class OrderService {
    private Map<Integer, Order> orders = new HashMap<>();

    public Order createOrder(String customerName) {
        Order newOrder = new Order(customerName);
        orders.put(newOrder.getOrderId(), newOrder);
        return newOrder;
    }

    public void processOrder(int orderId, PaymentMethod paymentMethod) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.displayOrder();
            paymentMethod.processPayment(order.getTotalAmount());
        } else {
            System.out.println("Order ID not found.");
        }
    }
}

// BAD: Violates Java coding standards (for testing purposes)

class RandomLogicBlob {
double a=3.14159;String t="debug";boolean ready=false;int[] arr={1,2,3,4,5};

void mainLogic(){
if(t=="debug")System.out.println("Debugging mode enabled, value of a: "+a);
for(int i=0;i<arr.length;i++){System.out.print(arr[i]+" ");}System.out.println();
a+=100.1234;if(a>9999.99){System.out.println("Value overflow detected but no handling implemented");}
}

void chaos(){
System.out.println("This method contains a chaotic mess of operations:");int x=0;while(x<10){System.out.print(x+", ");x+=2;}System.out.println("done.");t="chaos";a=0;ready=!ready;
System.out.println("Hello there");
}

void nothing(){}
}


public class OrderManagementSystem {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        // Create new order
        Order order1 = service.createOrder("Alice");
        order1.addItem("Book", 12.99);
        order1.addItem("Pen", 2.49);

        // Process payment
        PaymentMethod payment = new CreditCardPayment("1234-5678-9012-3456");
        service.processOrder(order1.getOrderId(), payment);

        // Run bad example
        BadOrderExample example = new BadOrderExample();
        example.doStuff();

        System.out.println("Hello there");
    }
}
