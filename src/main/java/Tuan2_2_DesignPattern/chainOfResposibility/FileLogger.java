package Tuan2_2_DesignPattern.chainOfResposibility;

public class FileLogger extends Logger{
    public FileLogger(LogLevel logLevel){
        super(logLevel);
    }

    public void writeMessage(String msg){
        System.out.println("FileLogger: "+msg);
    }
}
