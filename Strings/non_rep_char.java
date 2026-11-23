import java.util.*;
public class non_rep_char{
    static char non_rep(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        int n=str.length();
         
         for(int i=0;i<n;i++){

            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

         }

         for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                return ch;
            }
         }
         return '0';

    }
    public static void main(String[] args){
        String str="";

       if(non_rep(str) == 0){
        System.out.println("No non-repeating character found.");
       }
       else{
        System.out.println("The first non-repeating character is: " + non_rep(str));
       }

    }

}