package main;

public class LogicalOp {
//1
    public void afisare1(int a) {
        for (int i = a; i <= 100; i++)
            System.out.println(i);
    }
//2
    public void afisare2(int b) {
        for(int i =b; i>(-100); i--){
            System.out.println(i);
        }
    }
//3
    public void afisare3(int c, int d) {
        if (c > d)
            for (int i = d; i <= c; i++) {
                System.out.println(i);
            }
        else for (int i = d; i >= c; i--) {
            System.out.println(i);
        }
    }
//4
        public void afisare4(int a, int b)
        {
            if(a>b){
                for( int i=b; i<=a; i++)
                {
                    System.out.println(i);
                }}
                else for(int i=a; i<=b;i++) {
                System.out.println(i);
            }
        }
//5
    public void afisare5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
//6
    public void afisare6(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
//7
    public int afisare7(int a){
        int nr=0;
        for(int i=a; i<=100; i++)
        {
            nr=nr+i;
        }
        return nr;
    }
//8
   public float afisare8(int a){
        float sum=0, avg=0, nr=0;
        for(int i=a; i<=100; i++) {
            sum=sum+i;
            nr++;
        }
        return sum/nr;
}
//9
    public void afisare9(){
        String s="*";
        for(int i=6; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
