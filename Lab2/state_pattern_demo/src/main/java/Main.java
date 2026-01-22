public class Main {
    public static void main(String[] args) {

        System.out.println("===== KỊCH BẢN 1: ĐƠN HÀNG ĐI ĐẾN HOÀN TẤT =====");
        Order order1 = new Order();

        order1.process(); // Mới tạo -> Đang xử lý
        order1.process(); // Đang xử lý -> Đã giao
        order1.process(); // Đã giao (kết thúc)

        System.out.println("\n===== KỊCH BẢN 2: HỦY ĐƠN KHI ĐANG XỬ LÝ =====");
        Order order2 = new Order();

        order2.process(); // Mới tạo -> Đang xử lý
        order2.setState(new CancelledState()); // khách hủy
        order2.process(); // Hủy đơn

        System.out.println("\n===== KỊCH BẢN 3: HỦY ĐƠN NGAY KHI TẠO =====");
        Order order3 = new Order();

        order3.setState(new CancelledState());
        order3.process();

        System.out.println("\n===== KỊCH BẢN 4: NHIỀU ĐƠN HÀNG SONG SONG =====");
        Order[] orders = {
                new Order(),
                new Order(),
                new Order()
        };

        for (int i = 0; i < orders.length; i++) {
            System.out.println("\n--- Xử lý đơn hàng #" + (i + 1) + " ---");
            orders[i].process();
        }
    }
}
