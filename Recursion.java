public class Recursion {
    public static void recursion(String [] args) {
        int result = sum(10);
        System.out.println(result + " my name");

    }
    public static int sum(int j) {
        if(j > 0){
            return j + sum(j - 1);
        }else {
            return 0;
        }
    }
}