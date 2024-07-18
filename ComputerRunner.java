public class ComputerRunner {
    public static void main(String[] args) {
        Computer c1 = new Computer(1);
        Computer c2 = new Computer(1, "Dell");
        Computer c3 = new Computer(1, "Dell", "Inspiron");
        Computer c4 = new Computer(1, "Dell", "Inspiron", 2020);
        Computer c5 = new Computer(1, "Dell", "Inspiron", 2020, "Intel Core i5");
        Computer c6 = new Computer(1, "Dell", "Inspiron", 2020, "Intel Core i5", 8);
        Computer c7 = new Computer(1, "Dell", "Inspiron", 2020, "Intel Core i5", 8, 1000);
        Computer c8 = new Computer(1, "Dell", "Inspiron", 2020, "Intel Core i5", 8, 1000, 500000.0);
        Computer c9 = new Computer(1, "Dell", "Inspiron", 2020, "Intel Core i5", 8, 1000, 500000.0, "Windows 10");
        Computer c10 = new Computer(1, "Dell", "Inspiron", 2020, "Intel Core i5", 8, 1000, 500000.0, "Windows 10", "NVIDIA GeForce GTX 1650");
    }
}
