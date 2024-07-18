public class CharCount {
    public static void main(String[] args) {
        char[] name = {'P', 'r', 'a', 't', 'i', 'k','s','h','a',' ','U',' ','M'};
        char countChar = 'a';
        int count = 0;

        for (char c : name) {
            if (c == countChar) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + countChar + "': " + count);
    }
}

