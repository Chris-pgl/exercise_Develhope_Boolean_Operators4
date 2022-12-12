public class Tester {
    public static void main(String[] args) {

        //A
        int a =1;
        int b =3;
        int c = a*b;
        int d = c;
        //A
        boolean result = (d / c + 2) >= b || !(c + b - c / a == 3);
        System.out.println("A: "+result);

        //B
        int x= 5;
        int y = 6;
        boolean t = false;
        boolean f = false;
        boolean result1 = (x * x - y * y / 2 != 12) || !t && f;
        System.out.printf("B: "+result1);


    }
}