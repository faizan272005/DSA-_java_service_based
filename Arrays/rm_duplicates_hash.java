import java.util.*;
public class rm_duplicates_hash {
    
    public static void main(String[] args){
         int [] arr={1,1,2,2,3,4,4};
         int n=arr.length;
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
        set.add(arr[i]);
       }
       System.out.println(set);
    }
}