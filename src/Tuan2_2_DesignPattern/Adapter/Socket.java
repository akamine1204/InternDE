package Tuan2_2_DesignPattern.Adapter;

public class Socket {
    public Socket(){}

    public Volt getVolt(){
        return new Volt(120);
    }
}
