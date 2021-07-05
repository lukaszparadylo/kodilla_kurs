package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(12.0, "Apple", "Apple is good");
        Product computer = new Product(3000.0, "Dell Laptop", "The computer is very fast");
        Product car = new Product(1200.0, "Opel", "This car is very old");

        Client client1 = new Client("Jan","Kowalski", 5, "Karków ul. krakowska 1");
        Client client2 = new Client("Jadzia","Nowak", 4, "Warszawa ul. Warszawska 11");

        Basket basket = new Basket();
        basket.addToBasket(apple,3);
        basket.addToBasket(computer, 1);

        ProductOrderService productOrderService = new ProductOrderService(new DeliverByCourier(), new EmailMessage(), new InvoiceDocument(), new PayByBlik());
        productOrderService.processOrder(client1, basket);
    }
}
