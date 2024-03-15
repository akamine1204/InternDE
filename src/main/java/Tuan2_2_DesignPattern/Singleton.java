/*
Singleton - creational design pattern
giải quyết 2 vấn đề cùng 1 lúc:
- Đảm bảo rằng 1 lớp (class) sẽ chỉ có 1 instance duy nhất => hạn chế việc khởi tạo instance = cách set private cho constructor
- Cung cấp 1 điểm truy cập global đến instance đó. => xây dựng 1 method public static cho phép việc getInstance từ lớp singleton đó
* */

package Tuan2_2_DesignPattern;

public class Singleton {
    private static volatile Singleton instance; //biến volatile sử dụng nhằm mục đích thông báo sự thay đổi giá trị của biến tới các thread khác nhau nếu biến này đang đc sử dụng trong nhiều thread.

    private Singleton(){}

    public static synchronized Singleton getInstace(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
