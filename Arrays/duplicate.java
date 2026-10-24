public class duplicate {
    public static void find_duplicate(int []arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    System.out.println("Duplicate element is: "+arr[i]);
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int [] arr={2,4,5,7,2,3,4,2,5,6};
        find_duplicate(arr);
    }
}