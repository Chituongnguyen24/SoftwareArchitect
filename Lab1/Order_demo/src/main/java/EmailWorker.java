import redis.clients.jedis.Jedis;
import com.google.gson.Gson;
import java.util.List;

public class EmailWorker {

    static class SendEmailJob {
        int orderId;
        String email;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Jedis jedis = new Jedis("localhost", 6379)) {
            System.out.println("Email Worker đang chạy...");

            while (true) {
                List<String> result = jedis.brpop(0, "email_queue");
                String json = result.get(1);

                SendEmailJob job = gson.fromJson(json, SendEmailJob.class);

                sendEmail(job);
            }
        }
    }

    static void sendEmail(SendEmailJob job) {
        System.out.println("Đang gửi email cho order "
                + job.orderId + " tới " + job.email);

        try {
            Thread.sleep(2000); // giả lập gửi email
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Gửi email thành công!");
    }
}
