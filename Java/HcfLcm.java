import java.util.*;
class HcfLcm {
    public static void main(String args[]) {
        int a,b,x,y,hcf,lcm,t;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers");
        x=s.nextInt();
        y=s.nextInt();
        a=x;
        b=y;
        while(b>0) {
            t=b;
            b=a%b;
            a=t;
        }
        hcf=a;
        lcm=(x*y)/hcf;
        System.out.println("HCF="+hcf);
        System.out.println("LCM="+lcm);
    }
}
