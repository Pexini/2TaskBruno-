package HomeTask;

public class TriangleTop {
    public static void main(String[] args) {
        double x1 = 7.5;
        double y1 = 15.2;
        double x2 = 14.4;
        double y2 = 44.5;
        double x3 = 15.4;
        double y3 = 71.1;

        double AB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double BC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double CA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double s = (AB + BC + CA) / 2;
        double area = Math.sqrt(s * (s - AB) * (s - BC) * (s - CA));

        System.out.println("The area of the triangle is: " + area);
    }
}
