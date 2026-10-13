public class right_rotate{

    public static void right_rotate_byone(int[] arr){
        int n=arr.length;
        int last=arr[n-1];
        for(int i=n-1;i>0;i--) arr[i]=arr[i-1];
        arr[0]=last;
    }
    
    public static void right_rotate_byk(int [] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] temp=new int[n];
       for(int i=0;i<k;i++) temp[i]=arr[n-k+i];
       for(int i=n-1;i>=k;i--) arr[i]=arr[i-k];
       for(int i=0;i<k;i++) arr[i]=temp[i];
    }

    public static void print_array(int [] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }

    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        right_rotate_byone(arr);
        print_array(arr);
        right_rotate_byk(arr,4);
        print_array(arr);
    }
    
}