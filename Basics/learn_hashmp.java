import java.util.*;
class learn_hashmp {

    public static void main(String[] args) {

      HashMap<String,Integer> map=new HashMap<>();
        map.put("fa",69);
        //get(key) and getOrDefault(key,defaultValue)

        System.out.println(map.get("fa"));
        System.out.println(map.getOrDefault("fa",0));
        System.out.println(map.getOrDefault(69,0));
        System.out.println(map.getOrDefault("fa",0)+1);

        //containsKey(key) and containsValue(value)

        System.out.println(map.containsKey("fa"));
        System.out.println(map.containsValue(69));
        System.out.println(map.containsValue("69"));
       
        //remove(key, value)

        System.out.println(map.remove("fa",69));
        System.out.println(map.containsValue(69));
        
    }

}