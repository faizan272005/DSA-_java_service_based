public class rm_duplicates {
    
    static void rm_duplicates(int[] arr){
        int n=arr.length;
       boolean duplicate=false;
        for(int i=1;i<n;i++){
           for(int j=i+1;j<i;j++){
            if(arr[i]==arr[j]){
                duplicate=true;
                break;
            }
           }
           if(!duplicate){
            System.out.print(arr[i]+" ");
           }
        }
        
     

    }
    public static void main(String[] args){
         int[] arr = {4, 2, 4, 1, 2, 5};
         rm_duplicates(arr);
    }
}