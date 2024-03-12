import java.util.*;

public class Multi_Dimension {
    public static void main(String arg[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;

        try (Scanner S = new Scanner(System.in)) {
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=S.nextInt();
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
                // matrix[i][j]=S.nextInt();
            }
            System.out.println();
        }
    }
}
