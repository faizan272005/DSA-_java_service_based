public class left_rotate{

    public static void left_rotate_byone(int[] arr){
        int n=arr.length;
        int first=arr[0];
        for(int i=0;i<n-1;i++) arr[i]=arr[i+1];
        arr[n-1]=first;
    }

    public static void left_rotate_byk(int [] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] temp=new int[n];
        for(int i=0;i<k;i++) temp[i]=arr[i];
        for(int i=0;i<n-k;i++) arr[i]=arr[i+k];
        for(int i=0;i<k;i++) arr[n-k+i]=temp[i];
    }

    public static void print_array(int [] arr){
        for(int ele:arr) System.out.print(ele+" ");
        System.out.println();
    }

    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        left_rotate_byone(arr);
        print_array(arr);
        left_rotate_byk(arr,4);
        print_array(arr);
    }
}