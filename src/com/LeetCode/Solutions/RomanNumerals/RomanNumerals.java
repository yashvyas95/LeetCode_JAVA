package com.LeetCode.Solutions.RomanNumerals;

public class RomanNumerals {
    public static String intToRoman(int num){

        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] container = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        boolean condition = true;
        int index = 0;
        String result = "";

        if (num > 3999 || num < 1) {
            return "";
        } else {
            while (condition == true) {
                int next = findNextSmallest(num);
                int carry = num/values[next];
                if(carry !=0){
                    for(int car = 1 ; car <= carry ; car++)
                    {
                        result = result.concat(container[next]);
                    }
                }
                num = (num%values[next] == 0) ? 0 : num%values[next];
                if(num == 0){condition=false;}
            }
        }

        return result;
    }
    public static int findNextSmallest(int num) {
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int toReturn = 0;
        if (num > 1000) {
            return values.length-1;
        } else if (num != 0) {
            for (int i = 0; i < values.length; i++) {
                if (num < values[i]) {
                    toReturn = i - 1;
                    break;
                } else if (num == values[i]) {
                    toReturn = i;
                    break;
                }

            }
        }
        return toReturn;

    }

}
