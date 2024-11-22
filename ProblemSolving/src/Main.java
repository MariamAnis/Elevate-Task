public class Main {
    public static void main(String[] args) {
        printPrimeNumbersBetweenTwoNums(7,20);
    }

    public static void printPrimeNumbersBetweenTwoNums(int n,int m){
        if(n<m && n>=1 && n<=1000000){
            for (int i = n+1;i<m;i++){
                if (isPrime(i))
                    System.out.print(i+"\t");
            }

        }
    }

    public static boolean isPrime(int num){
        for (int i =2;i<num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}