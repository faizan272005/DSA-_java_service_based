public class similar_count{
    static  int similar_count(String a,String b){
        int n=a.length();
        int m=b.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a.charAt(i)==b.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str1="faizan";
        String str2="faizan";
        int result=similar_count(str1,str2);
        System.out.println(result);
    }
}