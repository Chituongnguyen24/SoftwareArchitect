package order;

import logging.LogManager;

public class OrderService {

    public void createOrder(int orderId) {
        LogManager logger = LogManager.getInstance();
        logger.log("Order created: " + orderId);
    }
}
