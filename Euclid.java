import java.util.Scanner;

public class Euclid{
    public static int  GCDWithRecursion(int p, int q){
        if(q==0) return p;
        else return GCDWithRecursion(q,p%q);
    }
    public static int GCDWithOutRecursion(int p, int q){
        while(q!=0){
            int rem = p%q;
            p=q;
            q=rem;
        }
        return p;
    }
    public static void main(String [] args){
        // int np = Integer.parseInt(args[0]);
        // int nq = Integer.parseInt(args[1]);
        // int ans = gcd(np, nq);
        // System.out.println(ans);
        Scanner p = new Scanner(System.in);
        Scanner q = new Scanner(System.in);
        System.out.print("Enter p: ");
        int np = p.nextInt();
        System.out.print("Enter q: ");
        int nq = q.nextInt();
        int ansWithRecursion = GCDWithRecursion(np, nq);
        int ansWithOutRecursion = GCDWithOutRecursion(np, nq);
        System.out.println("GCD with recursion call is : "+ansWithRecursion);
        System.out.println("GCD with out recursion call is : "+ansWithOutRecursion);

    }
}