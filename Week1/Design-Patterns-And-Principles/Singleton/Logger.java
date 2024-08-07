import java.util.*;
Public class Logger {

    // Private static instance of the same class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        // Initialization code, e.g., setting up file handlers or other resources
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                // Double-checked locking for thread safety
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Example method to log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
