// залікова книжка - 0222
//C2=0, 01="+"
//C3=0
//C5=2, 02="%"
//C7=5, тип i та j "float"

public class Lab1 {
    public static void main(String[] args) {
        float a = 2;
        float b = 1;
        float n = 3;
        float m = 3;
        double s = 0;

        if (a == 0 || b == 0) {
            System.out.println("Division by zero!");
        } else {
            if (a > n && b > m) {
                System.out.println("S = 0");
            } else {
                for (float i = a; i <= n; i++) {
                    for (float j = b; j <= m; j++) {
                        s += (double) (i % j) / i;
                    }
                }
                System.out.println("S = " + s);
            }
        }
    }
}
