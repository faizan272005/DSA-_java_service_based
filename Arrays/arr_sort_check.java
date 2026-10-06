public class arr_sort_check{
 static boolean sorted(int []arr){
     boolean sorted=true;
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        return sorted;
 }
     public static void main(String[] args){
        int [] arr={1, 2, 5, 3, 4};
        
        if(sorted(arr)) System.out.println("Sorted");
        else System.out.println("Not sorted");
     }
        
}