public class NumCount {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,9,5,1,2,3,6,4,7,7,7,5,6,9,1,2,3,4,5,6,9,8,4,5,};
        int countNum = 7;
        int count = 0;

        for (int c : nums) {
            if (c == countNum) {
                count++;
            }
        }

        System.out.println("Number of occurrences of '" + countNum + "': " + count);
    }
}

