public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            if (i % 3 == 0) {
                count++;
            } else if (i % 5 == 0){
                count++;
            }
            i++;
        }
        System.out.println("Count: " + count);
    }


}
