public class P4PALINDROM {
    public static void main(String[] args) {
        int firstN = 200;
        int secondN = 200;
        int maxx = 0;
        int maxy = 0;
        int maxPalindrome = 9009;
        for(int i = firstN; i < 1000; i++){
            for(int j = secondN; j < 1000; j++){
                int temp = i * j;
                String str = String.valueOf(temp);
                StringBuilder comp = new StringBuilder(String.valueOf(temp));
                comp.reverse();
                if(str.equals(comp.toString()) && maxPalindrome < i * j){
                    maxPalindrome = i * j;
                    maxx = i;
                    maxy = j;
                }
            }
        }
        System.out.println(maxx + " * " + maxy + " = " + maxPalindrome);
    }
}
