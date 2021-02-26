import java.io.*;

public class Task8Task9 {
    public static void main(String[] args)throws Exception {
        File file = new File("c:"+File.separator+"csatest"+File.separator
        +"demo.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer out=new FileWriter(file);
        String str="csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021";
        out.write(str);
        out.close();
        if(file.exists()){
            Reader in=new FileReader(file);
            char data[]=new char[1024];
            int len=in.read(data);
            in.close();
            String s=new String(data,0,len);
            System.out.println(count(s,"2021"));
            FileInputStream fis=new FileInputStream("c:"+File.separator+"csatest"+File.separator
                    +"demo.txt");
            File file2 = new File("c:"+File.separator+"csatest2"+File.separator
                    +"demo2.txt");
            if (!file2.getParentFile().exists()){
                file2.getParentFile().mkdirs();
            }
            FileOutputStream fos=new FileOutputStream("c:"+File.separator+"csatest2"+File.separator
                    +"demo2.txt");
            byte[]b=new byte[1024];
            while(fis.read(b)!=-1){
                fos.write(b);
            }
            fos.close();
            fis.close();
        }
    }

    private static int count(String s, String s1) {
        int count=0;
        while(true){
            if(s.indexOf(s1) == -1){
                break;
            }
            int temp = 0;
            temp = s.indexOf(s1);
            s = s.substring(temp+s1.length());
            count ++;
        }
        return count;
    }
}
