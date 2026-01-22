public class ProcessingState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Trạng thái: ĐANG XỬ LÝ");
        System.out.println("Đóng gói và vận chuyển");
        order.setState(new DeliveredState());
    }
}
