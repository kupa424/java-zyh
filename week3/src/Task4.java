import java.util.HashMap;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str1=in.next();
        HashMap<Character, Integer>map=new HashMap<>();
        for(char c:str1.toCharArray()){
            if(map.containsKey(c)){
                Integer value=map.get(c);
                value++;
                map.put(c,value);
            }
            else {
                map.put(c,1);
            }
        }
        for(Character key:map.keySet()){
            Integer value=map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
