public class alpha{

    static int [] check(String str){

        str=str.toLowerCase();
        int n=str.length();
        int vowles=0;
        int consonanets=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowles++;
            }
            else{
                consonanets++;
            }
        }
        return new int[]{vowles,consonanets};
        
    }
    public static void main(String[] args){
        String s ="faizan";
        int[] result = check(s);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}