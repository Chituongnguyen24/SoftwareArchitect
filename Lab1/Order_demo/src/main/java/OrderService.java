import redis.clients.jedis.Jedis;
import com.google.gson.Gson;

public class OrderService {

    public static void main(String[] args) {
        // 1. Tạo đơn hàng (giả lập)
        int orderId = createOrder();

        // 2. Push job vào Redis
        try (Jedis jedis = new Jedis("localhost", 6379)) {
            SendEmailJob job = new SendEmailJob(orderId, "user@gmail.com");
            String json = new Gson().toJson(job);

            jedis.lpush("email_queue", json);
            System.out.println("Đã tạo đơn & đẩy job gửi email");
        }
    }

    static int createOrder() {
        System.out.println("Đã tạo đơn hàng trong DB");
        return 101;
    }
}