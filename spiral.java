// import java.util.Scanner;
public class spiral {
    public static void Spiral_Matric(int matrix[][]){
        int Srow=0;
        int Lrow=matrix.length-1;
        int Scol=0;
        int Lcol=matrix[0].length-1;
        while(Srow<=Lrow&&Scol<=Lcol){
            // top
            for(int j=Scol;j<=Lcol;j++){
                System.out.print(matrix[Srow][j]+" ");
            }
            // right
            for(int i=Srow+1;i<=Lrow;i++){
                System.out.print(matrix[i][Lcol]+" ");
            }
            // bottom
            for(int j=Lcol-1;j>=Scol;j--){
                if(Scol==Lcol){
                    break;
                }
                System.out.print(matrix[Lrow][j]+" ");
            }
            // left
            for(int i=Lrow-1;i>=Srow+1;i--){
                if(Srow==Lrow){
                    break;
                }
                System.out.print(matrix[i][Scol]+" ");
            }
            Scol++;
            Srow++;
            Lcol--;
            Lrow--;
        }
        System.out.println();

    }

    // Diagonal Sum

    public static int Diagonal_Sum(int matrix[][]){
        int sum=0;// time com=n*n
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum +=matrix[i][j];
        //         }
        //         else if((i+j)==matrix.length-1){
        //             sum +=matrix[i][j];  
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            sum +=matrix[i][i];
            if(i!=matrix.length-i-1){
            sum +=matrix[i][matrix.length-i-1];
                
            }
        }
    return sum;
    }
    public static boolean Staire_Search(int matrix[][],int key){
        int row=0,col=matrix.length-1;

        while(row<matrix.length&& col>=0){
              if(matrix[row][col]==key){
                System.out.print("Found ket at ("+row+" , "+col+")");
                return true;
              }
              else if(key<matrix[row][col]){
                col--;
              }
              else{
                row++;
              }
        }
        System.out.print("Key not found");
        return false;

    }
    public static void main(String arg[]){
        int matrix[][]={{1,2,3,4},
                        {6,7,8,9},
                        {11,12,13,14},
                        {16,17,18,19}};
        int key=13;
    Staire_Search(matrix, key);                
    // System.out.print(Diagonal_Sum(matrix));                    
    // Spiral_Matric(matrix);                

    }
}
