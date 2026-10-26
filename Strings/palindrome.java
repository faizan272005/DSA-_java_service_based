public class palindrome{
    static void palin(String str){
        int n=str.length();
        if (str == null) {
            System.out.println("not palindrome");
            return;
        }
        boolean same=true;
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                same=false;
                break;
            }
        }
        System.out.println(same ? "palindrome" :" not palindrome");
    }
    public static void main(String[] args){
        String str="madam";
        palin(str);
    }
}