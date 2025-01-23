public class MirrorCharacters {

    public static String mirrorCharacters(String str, int N) {
        char[] chars = str.toCharArray();

        for (int i = N - 1; i < chars.length; i++) {
            chars[i] = (char) ('z' - (chars[i] - 'a'));
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str1 = "paradox";
        int N1 = 3;

        String str2 = "pneumonia";
        int N2 = 6;

        System.out.println("Mirrored string for " + str1 + " (N=" + N1 + "): " + mirrorCharacters(str1, N1));
        System.out.println("Mirrored string for " + str2 + " (N=" + N2 + "): " + mirrorCharacters(str2, N2));
    }
}