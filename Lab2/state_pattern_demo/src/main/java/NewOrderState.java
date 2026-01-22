public class NewOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("🔹 Trạng thái: MỚI TẠO");
        System.out.println("Kiểm tra thông tin đơn hàng...");
        order.setState(new ProcessingState());
    }
}
