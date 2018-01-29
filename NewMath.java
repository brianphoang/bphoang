public class NewMath 
// class body
{
    public static void main(String[] args) 
    {

        short s = 10;
        long l = 123456789L;
        double d = 3.14;

        // 10 * 123456789
        System.out.print("s * l = ");
        System.out.println(s * l);
        
        // 10 * 3.14
        System.out.print("s * d = ");
        System.out.println(s * d);
        
        // 123456789 * 3.14
        System.out.print("l * d = ");
        System.out.println(l * d);
       
        // 10 - 123456789
        System.out.print("s - l = ");
        System.out.println(s - l);
        
        // 10 - 3.14
        System.out.print("s - d = ");
        System.out.println(s - d);
        
        // 123456789 - 3.14
        System.out.print("l - d = ");
        System.out.println(l - d);
        
        // 123456789 - 10
        System.out.print("l - s = ");
        System.out.println(l - s);
        
        // 3.14 - 10
        System.out.print("d - s = ");
        System.out.println(d - s);
        
        // 3.14 - 123456789
        System.out.print("d - l = ");
        System.out.println(d - l);

    }
}