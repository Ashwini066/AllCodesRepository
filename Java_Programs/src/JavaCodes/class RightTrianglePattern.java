package JavaCodes;
class RightTriangleInversePattern {
    public static void main(String args[]) {
        int rows = 5;
        for(int i = 0; i <= rows; i++) {
            for(int j = 5; j >= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
