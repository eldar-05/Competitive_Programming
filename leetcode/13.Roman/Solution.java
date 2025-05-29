class Solution {
    public static int romanToInt(String s) {
        int answer = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(converter(s.charAt(i)) >= converter(s.charAt(i + 1))){
                answer = answer + converter(s.charAt(i));
            }
            else{
                answer = answer - converter(s.charAt(i));
            }
        }
        return (answer + converter(s.charAt(s.length() - 1)));
    }

    public static int converter(char q){
        if(q == 'I'){
            return 1;
        }
        else if(q == 'V'){
            return 5;
        }
        else if(q == 'X'){
            return 10;
        }
        else if(q == 'L'){
            return 50;
        }
        else if(q == 'C'){
            return 100;
        }
        else if(q == 'D'){
            return 500;
        }
        else{
            return 1000;
        }
    }
}