public class LoggerTest {
    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Test that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances were created.");
        }

        // Log a message to verify functionality
        logger1.log("This is a test log message.");
        logger2.log("This message will be logged to the same instance");
    }
}
