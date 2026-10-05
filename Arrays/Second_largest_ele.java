public class Second_largest_ele{
    public static void main(String[] args){
        
       int [] arr={9,8,7,4,21};
       int max=Integer.MIN_VALUE;
       int sec_max=Integer.MIN_VALUE;
       int n=arr.length;

       for(int i=0;i<n;i++){

        if(arr[i]>max) {
            sec_max=max;
            max=arr[i]; 
        }
        else if(arr[i]>sec_max && max<sec_max) sec_max=arr[i];
       }

       System.out.println(max);
        System.out.println(sec_max);
    }
}