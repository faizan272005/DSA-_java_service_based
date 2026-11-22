import java.util.*;

public class duplicate_frequency{

    
    static String dup_frequency(String str) {

    HashMap<Character, Integer> map = new HashMap<>();
    HashMap<Character, Integer> duplicate = new HashMap<>();

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
        for(char ch:map.keySet()){
            if(map.get(ch)>1){
                duplicate.put(ch,map.get(ch));
            }
        }

    return duplicate.toString();
}

    public static void main (String[] args){
        String a="faizan";
        
        System.out.println(dup_frequency(a));
    }

}