package Academy.Learningprogramming;

public class StringToInteger {

    public int myAtoi(String s) {

        int res = 0;
        int sign = 1;

        int i = 0;

        while (i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if(i<s.length() && s.charAt(i) == '+'){
            sign = 1;
            i++;
        } else if( i<s.length() && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }

        for(int j=0; j<s.length(); j++){

            if( (s.charAt(j) - '0' >= 0 && s.charAt(j) - '0' <= 9) ) {

                res = ( (res * 10) + (s.charAt(j) - '0') );

            } else if(s.charAt(j) == '-') {

                res = res * sign;
            } else if(! (s.charAt(j) - '0' >= 0 && s.charAt(j) - '0' <= 9) ){

                return 0;
            }
        }

        return res * sign;
    }
}
