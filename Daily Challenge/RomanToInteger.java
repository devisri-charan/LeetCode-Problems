public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int ans = 0;
        char[] roman = s.toCharArray();
        int i = 0;
        while (i < roman.length) {
            char c = roman[i];
            if (c == 'I') {
                if (i + 1 < roman.length && roman[i + 1] == 'V') {
                    ans += 4;
                    i += 2;
                } 
                else if (i + 1 < roman.length && roman[i + 1] == 'X') {
                    ans += 9;
                    i += 2;
                } 
                else {
                    ans += 1;
                    i++;
                }
            } 
            else if (c == 'V') {
                ans += 5;
                i++;
            }
            else if (c == 'X') {
                if (i + 1 < roman.length && roman[i + 1] == 'L') {
                    ans += 40;
                    i += 2;
                }
                else if (i + 1 < roman.length && roman[i + 1] == 'C') {
                    ans += 90;
                    i += 2;
                }
                else {
                    ans += 10;
                    i++;
                }
            } 
            else if (c == 'L') {
                ans += 50;
                i++;
            } 
            else if (c == 'C') {
                if (i + 1 < roman.length && roman[i + 1] == 'D') {
                    ans += 400;
                    i += 2;
                } 
                else if (i + 1 < roman.length && roman[i + 1] == 'M') {
                    ans += 900;
                    i += 2;
                } 
                else {
                    ans += 100;
                    i++;
                }
            } 
            else if (c == 'D') {
                ans += 500;
                i++;
            } 
            else if (c == 'M') {
                ans += 1000;
                i++;
            }
        }
        return ans;
    }
}
