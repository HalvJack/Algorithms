package org.example.RomanToInteger13;

public class Main {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    number++;
                    break;
                case 'V':
                    if(s.charAt(i-1) == 'I'){
                        number+=3;
                    }
                    else number+=5;
                    break;
                case 'X':
                    if(s.charAt(i-1) == 'I'){
                        number+=8;
                    }
                    else number+=10;
                    break;
                case 'L':
                    if(s.charAt(i-1) == 'X'){
                        number+=30;
                    }
                    else number+=50;
                    break;
                case 'C':
                    if(s.charAt(i-1) == 'X'){
                        number+=80;
                    }
                    else number+=100;
                    break;
                case 'D':
                    if(s.charAt(i-1) == 'C'){
                        number+=300;
                    }
                    else number+=500;
                    break;

                case 'M':
                    if(s.charAt(i-1) == 'C'){
                        number+=800;
                    }
                    else number+=1000;
                    break;

            }
        }
        return number;
    }
}
