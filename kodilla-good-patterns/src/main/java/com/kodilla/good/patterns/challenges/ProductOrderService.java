package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private DeliveryService deliveryService;
    private MessageSender messageSender;
    private DocumentsSender documentsSender;
    private PayOutOrder payOutOrder;

    public ProductOrderService(DeliveryService deliveryService, MessageSender messageSender, DocumentsSender documentsSender, PayOutOrder payOutOrder) {
        this.deliveryService = deliveryService;
        this.messageSender = messageSender;
        this.documentsSender = documentsSender;
        this.payOutOrder = payOutOrder;

    }
    public void processOrder(Client client, Basket basket){

        this.payOutOrder.payOutOrder(client,basket);
        this.deliveryService.deliverProducts();
        this.messageSender.sendMessage();
        this.documentsSender.sendDocument();
        System.out.println("Your Id is: "+client.getClientId());
        System.out.println("Your Name: "+client.getClientName());
        System.out.println("Your Surname: "+client.getClientSurname());
    }
}
