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
        if (n == 0) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }
        int fibo = Fibonaci(n - 1) + Fibonaci(n - 2);
        return fibo;
    }

    public static void main(String[] args) {

        // test giai thừa
        System.out.println(GiaiThua(4));

        //test fibonaci
        System.out.println(Fibonaci(0));

    }

}
