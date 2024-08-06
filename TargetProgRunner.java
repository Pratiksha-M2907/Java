package com.xworkz.inheritence.runner;
import JavaProgs.TargetProg;
public class TargetProgRunner {
	public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 7, 8, 2, 3, 4,6};
        int target = 7;
        TargetProg.findSubarrays(array, target);
    }
}
