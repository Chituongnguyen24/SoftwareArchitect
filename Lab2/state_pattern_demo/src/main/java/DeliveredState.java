public class DeliveredState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Trạng thái: ĐÃ GIAO");
        System.out.println("Cập nhật đơn hàng đã giao");
    }
}
