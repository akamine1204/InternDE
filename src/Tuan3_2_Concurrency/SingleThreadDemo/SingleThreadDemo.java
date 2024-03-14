package Tuan3_2_Concurrency.SingleThreadDemo;

public class SingleThreadDemo {
    public static void main(String args[]) throws InterruptedException {
        Thread luong = new Thread(new Runnable() {
            @Override
            public void run() {//thực hiện việc luôn chạy và in ra màn hình sau mỗi giây
                try {
                    while(true){
                        System.out.println("Luồng vẫn đang chạy..!!!");
                            Thread.currentThread().sleep(1000);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        luong.setDaemon(true); //đặt luong là luồng hiểm
        luong.start();

        Thread.currentThread().sleep(8000);

        System.out.println("Luồng main kết thúc..!");

    }
}
