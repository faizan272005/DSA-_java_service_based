import java.util.*;
public class duplicate_hashset{
    static String  check_duplicate(String str){

        HashSet<Character> set=new HashSet<>();
        StringBuilder result =new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;i++){
            char c=str.charAt(i);
           if(set.add(c)){
            result.append(c);
           }
        }

        return result.toString();
    }
    public static void main(String[] args){

        String str="faizan";
        System.out.println(check_duplicate(str));
    }
}