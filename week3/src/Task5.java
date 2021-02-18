public class Task5 {
    public static void main(String[] args) throws TCPException {//throws TCPException {

//        if(i==3/0){
//            throw new TCPException("");
//        }
        try { int i=3/0;}
        catch (Exception e){
            throw new TCPException(false,20001,"发生了除零错误！");
        }
    }
}
class TCPException extends Exception{
    public TCPException() {
    }

    public TCPException(String message) {
        super(message);
    }

    public TCPException(boolean b, int i, String s) {
        System.out.println(i+s);
    }
}