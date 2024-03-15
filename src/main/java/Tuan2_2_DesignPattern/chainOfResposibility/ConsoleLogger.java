package Tuan2_2_DesignPattern.chainOfResposibility;

public class ConsoleLogger extends Logger {
    public ConsoleLogger (LogLevel logLevel) {
        super(logLevel);
    }

    public void writeMessage(String msg){
        System.out.println("Console logger: "+msg);
    }

}
