package JavaProgs;
public class TargetProg {
	public static void findSubarrays(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum == target) {
                    System.out.println(getSubarray(array, i, j));
                }
            }
        }
    }

public static String getSubarray(int[] array, int start, int end) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = start; i <= end; i++) {
        sb.append(array[i]);
        if (i < end) {
            sb.append(",");
        }
    }
    sb.append("]");
    return sb.toString();
}
}