import java.util.*;
public class learn_hashset{
    public static void main(String[] args){
        HashSet<Character> set =new HashSet<>();
        set.add('f');
        set.add('a');
        set.add('i');
        System.out.println(set);
        System.out.println(set.contains('f'));
        System.out.println(set.size());
        set.remove('a');
        System.out.println(set);    
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}