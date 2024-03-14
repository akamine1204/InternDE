package Tuan2_2_DesignPattern.chainOfResposibility;

public class AppLogger {
    public static Logger getLogger() {
        Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        Logger fileLogger = consoleLogger.setNext(new FileLogger(LogLevel.ERROR));
        Logger emailLogger = fileLogger.setNext(new EmailLogger(LogLevel.FATAL));
        return consoleLogger;
    }
}
