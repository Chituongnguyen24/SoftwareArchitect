import redis.clients.jedis.Jedis;
import com.google.gson.Gson;

class SendEmailJob {
    int orderId;
    String email;

    public SendEmailJob(int orderId, String email) {
        this.orderId = orderId;
        this.email = email;
    }
}