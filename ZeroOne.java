class Program {
int[] array;
int count0;
int count1;

public Program(int[] array) {
this.array = array;
this.count0 = 0;
this.count1 = 0;
count();
}

public void count() {
for (int i : array) {
if (i == 0) {
count0++;
} else if (i == 1) {
count1++;
}
}
}

public static void main(String[] args) {
int[] array = {0, 1, 0, 0, 1, 0, 1, 0, 1};
Program program = new Program(array);
System.out.println("Count of 0's: " + program.count0);
System.out.println("Count of 1's: " + program.count1);
}
}
