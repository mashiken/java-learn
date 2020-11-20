public class Lesson05 {
    public static void main(String[] args){
        int x=10;
        int y=2;
        int z=10;
    
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x <= z);

        System.out.println(x == y);
        System.out.println(x != y);

        int a = 8;
        int b = 3;
        System.out.println(a >= 5 && a <= 10);
        System.out.println(b >= 5 && b <= 10);
        
        int c = 8;
        int d = 3;
        System.out.println(c == 3 || d == 3);
        System.out.println(c == 1 || d == 1);

        System.out.println(a+=c);
        System.out.println(d+=b);
        c++;
        b--;
        System.out.println(c);
        System.out.println(b);
    }

}
