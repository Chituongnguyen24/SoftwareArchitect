public class CancelledState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Trạng thái: HỦY");
        System.out.println("Hủy đơn hàng và hoàn tiền");
    }
}
