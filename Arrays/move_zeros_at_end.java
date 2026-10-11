public class move_zeros_at_end{

    static void move_zeros(int [] arr){
        int n=arr.length;
        //appraoch:two pointer approach
        int j=0;

        for(int i=0;i<n;i++){
           if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
           }
        }
        
        for(int ele:arr) System.out.print(ele+" ");
    }

    public static void main(String[] args){
        int [] arr={1, 3, 12, 0, 0};
        move_zeros(arr);
    }

}