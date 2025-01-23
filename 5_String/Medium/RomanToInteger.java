import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void romanToInt2(String s) {
        s = s.replace("IV", "IIII");//4
		s = s.replace("IX", "VIIII");//9
		s = s.replace("XL", "XXXX");//40
		s = s.replace("XC", "LXXXX");//90
		s = s.replace("CD", "CCCC");//400
		s = s.replace("CM", "DCCCC");//900
		Map<Character, Integer> roman = new HashMap<>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum = sum + roman.get(s.charAt(i));
		}
		System.out.println(sum);
    }
    public static int romanToInt(String s) {

        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        String roman = "MCMXCIV"; // Example input
        romanToInt2(roman);
        int integerValue = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + integerValue);
    }
}
