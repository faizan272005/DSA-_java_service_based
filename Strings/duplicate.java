public class duplicate{
    static String check(String str){
        int n=str.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                if(str.charAt(i)==str.charAt(j)){
                    result.append(str.charAt(i));
                    break;
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        String s="faizan";
        System.out.println(check(s));
    }
}