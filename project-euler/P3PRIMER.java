public class P3PRIMER{
    public static void main(String[] args) {
        long biggestNum = 600851475143L;
        long until = 775145;
        int answer = 0;
        for(int i = 0; i < until; i++){
            if(isPrime(i) && biggestNum % i == 0){
                answer = i;
            }
        }
        System.out.println(answer);
    }

    public static boolean isPrime(double a){
        long n = (long)a;
        if(n == 2 || n == 3 || n == 5 || n == 7){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0 || n % 71 == 0){
            return false;
        } else {
            return true;
        }
    }
}