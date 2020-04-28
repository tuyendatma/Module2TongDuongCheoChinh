import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap chieu rong ma tran");
        int width = scanner.nextInt();

        int[][] matrix = new int[width][width];
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <width ; j++) {
                System.out.print("nhap gia tri tai x= "+i+" y= "+j+"\t");
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        int sumCheoChinh =0;
        int sumCheoPhu=0;
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(i==j){
                    sumCheoChinh+= matrix[i][j];
                }
                if(i+j==matrix[0].length-1){
                    sumCheoPhu+=matrix[i][j];
                }
            }
        }
        System.out.println("tong duong cheo chinh: "+sumCheoChinh);
        System.out.println("tong duong cheo phu: "+sumCheoPhu);
    }
}
