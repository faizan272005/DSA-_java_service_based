public class max_difference{
    static int sub(int [] arr){
        int n=arr.length;
        int max_diff=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
                if(diff> max_diff){
                    max_diff=diff;
                }
            }
        }
        return max_diff;
    }
    public static void main(String[] args){
        int [] arr={7, 1, 5, 3, 6, 4};
        System.out.println(sub(arr));
    }
}