public class SpiralMatrix {

    static void printSpiral(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    static int DaigonaSum(int  [] []matrix){
    int sum=0;
    for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i)
            sum += matrix[i][matrix.length - 1 - i];
    }
    return sum;
    }
    static boolean StirSearchAlgorithm(int  [] []matrix,int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
        if(key==matrix[row][col]){
            System.out.println("matrix found at"+row+","+col);
            return true;

        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
        }
    System.out.println("matrix  not found at");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int key=9;

        printSpiral(matrix);
        System.out.println(DaigonaSum(matrix));
        StirSearchAlgorithm(matrix,9);
    }
}
