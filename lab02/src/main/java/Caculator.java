public class Caculator {
    public static double Tong(double a, double b) {
        return a + b;
    }

    public static double Tru(double a, double b) {
        return a - b;
    }

    public static double Nhan(double a, double b) {
        return a * b;
    }

    public static double Chia(double a, double b) {
        return a / b;
    }
//
//    public static int BinhPhuong(int a, int b) {
//        return (int) Math.pow(a, b);
//    }
//
//    public static int canBachai(int a) {
//        return (int) Math.sqrt(a);
//    }
//
    public static short giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return 0;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
        return 0;
    }
}
