/*
Adapter - Structural Design Pattern
- Giữ vai trò trung gian giữa 2 lớp, chuyển đổi interface của một hay nhiều lớp có
sẵn thành một interface khác thích hợp cho lớp đang viết.
 */


package Tuan2_2_DesignPattern.Adapter;

public class SocketImp extends Socket implements SocketAdapter {
    public Volt getVolt100(){
        Volt v = getVolt();
        v.setVolt(100);
        return v;
    }

    public Volt getVolt200(){
        Volt v = getVolt();
        v.setVolt(200);
        return v;
    }

    public Volt getVolt220(){
        Volt v = getVolt();
        v.setVolt(220);
        return v;
    }

}
