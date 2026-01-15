import redis.clients.jedis.Jedis;

public class Producer {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);

        for (int i = 1; i <= 5; i++) {
            String message = "Task " + i;
            jedis.lpush("task_queue", message);
            System.out.println("Đã gửi: " + message);
        }

        jedis.close();
    }
}
