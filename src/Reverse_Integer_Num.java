public class Reverse_Integer_Num {
    public static void main(String[] args) {
        int n=231,rem,rev=0;
//        while (n!=0){
//            rem=n%10;
//            rev=rev*10+rem;
//            n=n/10;
//        }
//        System.out.println(rev);

        for ( n=231 ; n>0; n=n/10 ){
            rem=n%10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
