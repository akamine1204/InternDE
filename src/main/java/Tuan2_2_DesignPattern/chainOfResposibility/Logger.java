package Tuan2_2_DesignPattern.chainOfResposibility;

public abstract class Logger {
    protected Tuan2_2_DesignPattern.chainOfResposibility.LogLevel logLevel;
    protected Logger nextLogger;   //Trinh xu ly tiep theo

    public Logger(LogLevel logLevel){
        this.logLevel = logLevel;
    }

    public Logger setNext(Logger nextLogger){
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel severity,String msg){
        if(severity.getLevel() > logLevel.getLevel()){
            writeMessage(msg);
        }
        if(nextLogger!=null){
            nextLogger.log(severity,msg);
        }
    }

    protected abstract void writeMessage(String msg);
}
