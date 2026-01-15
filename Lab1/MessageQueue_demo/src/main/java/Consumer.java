import redis.clients.jedis.Jedis;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);

        System.out.println("Đang chờ message...");

        while (true) {
            // BRPOP: block cho tới khi có message
            List<String> result = jedis.brpop(0, "task_queue");

            String message = result.get(1);
            System.out.println("Nhận được: " + message);

            // giả lập xử lý
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
