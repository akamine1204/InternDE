package Tuan2_2_DesignPattern.chainOfResposibility;

public class EmailLogger extends Logger {
    public EmailLogger(LogLevel logLevel){
        super(logLevel);
    }

    public void writeMessage(String msg){
        System.out.println("EmailLogger: "+msg);
    }
}
