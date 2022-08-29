public class While_Natural_Num {
    public static void main(String[] args) {

        int n=5 , sum=0;
        while (n>0){
            sum = sum+n;
            n=n-1;
        }
        System.out.println("Addition is " + sum);

//        for (int i=1; i<=n; i++){
//            sum=sum+i;
//        }
//        System.out.println( "Addition is " +  sum );
    }
}
