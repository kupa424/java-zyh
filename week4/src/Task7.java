import java.lang.reflect.Array;
import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入字符串个数：");
        int a=in.nextInt();
        String[]s=new String[a];
        System.out.println("请输入字符串内容：");
        for (int i = 0; i < s.length; i++) {
            s[i]=in.next();
        }
        System.out.println(group(s));
    }

    private static List<List<String>> group(String[] str) {
        if(str.length==0)
            return new ArrayList();
        HashMap<String,List>map = new HashMap<>();
        for(String s:str){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=String.valueOf(c);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
