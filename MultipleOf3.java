class MultipleOf3 {
    public static void main(String[] args) {
        int limit = 30; 
        
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0) {
                System.out.println(i+" Is multiple of 3");
            }
        }
    }
}
