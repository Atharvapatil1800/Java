import java.util.Scanner;
class First {
    public static void main(String[] args) {
        double area, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        r = sc.nextDouble();
        area = 3.14159*r*r;
        System.out.println("Area is "+area);
    }
}
