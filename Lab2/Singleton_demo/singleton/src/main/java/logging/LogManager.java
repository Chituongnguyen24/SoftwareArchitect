
package logging;

public class LogManager {

    // 1. Instance duy nhất
    private static LogManager instance;

    // 2. Constructor PRIVATE (cốt lõi Singleton)
    private LogManager() {
        System.out.println("LogManager created");
    }

    // 3. Method truy cập instance
    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    // 4. Hành vi chung
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
