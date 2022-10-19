public class L1Q2 {
    public static void main(String[] args) {
        int x1, y1, z1, x2, y2, z2;
        float dist;

        x1 = 4; y1 = -8; z1 = -9;
        x2 = 2; y2 = -3; z2 = -5;

        dist = (float)(Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2)));
        System.out.printf("%.2f",dist);
    }
}
