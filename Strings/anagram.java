import java.util.*;
public class anagram{
static boolean check(String n1,String n2){
     n1=n1.toLowerCase();
     n2=n2.toLowerCase();
    int len1=n1.length();
    int len2=n2.length();

    if (len1!=len2) return false;

    HashMap<Character,Integer> map1=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();
      for(int i=0;i<len1;i++){
        char ch1=n1.charAt(i);
        char ch2=n2.charAt(i);
        map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        map2.put(ch2,map2.getOrDefault(ch2,0)+1);
      }
      System.out.println(map1);
      System.out.println(map2);
      return map1.equals(map2);
      

}
    public static void main (String[] args){
        String  n1="listen";
        String  n2="silent";
        System.out.println(check(n1,n2));
    }
}