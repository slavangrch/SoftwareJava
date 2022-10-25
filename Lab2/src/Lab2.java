//залікова книжка - 0222
//C5=2, C=A+B
//C7=4, long
//C11=2, обчислити суму найбільших елементів кожного стовпця матриці

public class Lab2 {
    public static void main(String[] args) {
        long[][] A =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {2,3,4}
                };

        System.out.println("Матриця А:");

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[i].length; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        long[][] B =
                {
                        {10,11,12},
                        {13,14,15},
                        {16,17,18},
                        {35,12,11}
                };
        System.out.println("Матриця B:");

        for (int i = 0; i < B.length; i++){
            for (int j = 0; j < B[i].length; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        if (A.length != B.length || A[0].length != B[0].length){
            System.out.println("Додавання матриць різного розміру виконати неможливо!");
            return;
        }

        System.out.println("Матриця С:");

        long[][] C = new long[A.length][A[0].length];
        for (int i = 0; i < C.length; i++){
            for (int j = 0; j < C[0].length; j++){
                C[i][j] = (A[i][j] + B[i][j]);
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
        double maxElement;
        int sum = 0;
        int j;
        for (int i = 0; i < B[0].length; i++) {
            maxElement = C[0][i];
            for (j = 1; j < A.length; j++) {
                if (C[j][i] > maxElement) {
                    maxElement = C[j][i];
                }
            }
            sum += maxElement;
        }
        System.out.println("Сума найбільших елементів кожного стовпця матриці C: " + sum);
    }
}

