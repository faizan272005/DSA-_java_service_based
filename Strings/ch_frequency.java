import java.util.*;

public class ch_frequency{

    static HashMap<Character,Integer> check_frequency(String str){

         int n=str.length();
         HashMap<Character,Integer> map=new HashMap<>();

         for(int i=0;i<n;i++){

            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
         }
         
       return map;

    }

    public static void main (String[] args){
        String a="faizan";
        HashMap<Character,Integer> res=check_frequency(a);
        System.out.println(res);
    }

}