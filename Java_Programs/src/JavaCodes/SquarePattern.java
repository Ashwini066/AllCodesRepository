package JavaCodes;
class PrintSquare {
    public static void main(String args[]) {
        int rows = 5;
        for(int i =0 ; i <rows; i++) {
            for(int j = 0; j <rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}