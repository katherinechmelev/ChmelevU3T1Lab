public class Runner{
    public static void main (String[] args){
            int a = 15;
            int b = 15;
            int c = 20;
            System.out.println("-- Set A --");
            System.out.println(a > b);
            System.out.println(a < b);
            System.out.println(a >= b);
            System.out.println(a <= b);

            System.out.println("-- Set B --");
            System.out.println(a > c);
            System.out.println(a < c);
            System.out.println(a >= c);
            System.out.println(a <= c);

            System.out.println("-- Set C --");
            System.out.println((a >= 15) == (c > b));
            System.out.println((b < c) == (a < b));
            System.out.println((a == c) == (b == c));
            System.out.println((a == b) == (b == c));


    }
}