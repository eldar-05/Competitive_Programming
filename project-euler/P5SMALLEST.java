public class P5SMALLEST {
    public static void main(String[] args) {
        int start = 2520;

        while(true){
            int counter = 0;
            for(int i = 1; i <= 20; i++){
                if(check(start, i)){
                    counter++;
                }
            }
            if(counter > 19){
                System.out.println(start);
                break;
            }
            start++;
        }
    }

    public static boolean check(int source, int addition){
        if(source % addition == 0){
            return true;
        } else {
            return false;
        }
    }

}
