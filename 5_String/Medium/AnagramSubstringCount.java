import java.util.HashMap;

public class AnagramSubstringCount {
    public static int countAnagramSubstrings(String str) {
        HashMap<String, Integer> freqMap = new HashMap<>();

        // Traverse all substrings
        for (int i = 0; i < str.length(); i++) {
            int[] charCount = new int[26];

            for (int j = i; j < str.length(); j++) {
                charCount[str.charAt(j) - 'a']++;

                // Generate a unique key based on the character count
                String key = generateKey(charCount);

                freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
            }
        }

        // Calculate the total number of anagram pairs
        int totalCount = 0;
        for (int count : freqMap.values()) {
            totalCount += (count * (count - 1)) / 2;
        }

        return totalCount;
    }

    private static String generateKey(int[] charCount) {
        StringBuilder key = new StringBuilder();
        for (int count : charCount) {
            key.append(count).append("#");
        }
        return key.toString();
    }

    public static void main(String[] args) {
        String str1 = "xyyx";
        System.out.println("Total Anagram Substrings: " + countAnagramSubstrings(str1));

        String str2 = "geeg";
        System.out.println("Total Anagram Substrings: " + countAnagramSubstrings(str2));
    }
}
