public class Task11 {
    public static void main(String[] args) {
        Message msg=new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
class Message{
    private String title;
    private String content;
    private boolean flag=true;
    public synchronized void set(String title,String content){
        if(this.flag==false){
            try {
                super.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        this.title=title;
        try {
            Thread.sleep(200);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.content=content;
        this.flag=false;
        super.notify();
    }
    public synchronized void get(){
        if(this.flag==true){
            try{
                super.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(this.title+"-->"+this.content);
        this.flag=true;
        super.notify();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
class Producer implements Runnable {
    private Message msg = null;
    public Producer(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            if(i%2==0){
                this.msg.set("李兴华","Java讲师");
            }
            else {
                this.msg.set("mldn","www.mldnjava.cn");
            }
        }
    }
}
class Consumer implements Runnable{
    private Message msg = null;
    public Consumer(Message msg){
        this.msg=msg;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            this.msg.get();
        }
    }
}
