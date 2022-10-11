package rescursion;

public class Rescursion {

//    public static void printF() {
//        System.out.println("F");
//        printF();
//    }
//tính n! -----(n giai thừa) --Factorial
//bài toán cơ sở 0!=1
    //công thức quy nạp n!=n*(n-1)
    public static int GiaiThua(int n) {
        //bài toán cơ sở
        if (n == 0) {
            return 1;
        }
        //Công thức quy nạp
        int fac = n * GiaiThua(n - 1);
        return fac;
    }

//tìm số fibonaci thứ n
    public static int Fibonaci(int n) {
//bài toán cơ sở
        // System.out.println("Tinh: F[" + n + "]");
        if (n == 0) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }
        int fibo = Fibonaci(n - 1) + Fibonaci(n - 2);
        return fibo;
    }
    static int[] f = new int[1000];
//
//
// đệ quy có nhớ

    public static int Fibo2(int n) {
        if (f[n] != 0) {
            return f[n];
        }
        //System.out.println("can tinh f[" + n + "]");
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {

            f[1] = 1;
            f[2] = 1;
            return 1;
        }
        f[n] = Fibo2(n - 1) + Fibo2(n - 2);
        return f[n];
    }

    //
    //
    //
    //in các phần tử trong một mảng
    public static void printArray(int[] arr, int index) {
        //bài toán cơ sở
        if (index < 0 || index >= arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(arr, index + 1);

    }

    public static void main(String[] args) {

        // test giai thừa
//        System.out.println(GiaiThua(4));
//        System.out.println("\n");
//
//        //test fibonaci
//        System.out.println(Fibonaci(5));
//        System.out.println("\n");
//
        //test in mảng
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //printArray(arr, 0);
        //
        //test fibo2
        System.out.println(Fibo2(5));
        System.out.println("\n");
    }

}
