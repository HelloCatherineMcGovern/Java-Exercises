
//code below prints out the first 20 fibonacci numbers.
public class Fibonacci{
    public static void main(String []args){ 

        int x = 0;
        int y = 1;
        int a = 0;
        while (a < 20) {
            System.out.println(x);
            System.out.println(y);
            x = x + y;
            y = x + y;
            a++;
        }    
    }
}