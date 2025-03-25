package com.Student.transposeOfMatrix;
import java.util.*;

public class TransposeOfMatrix {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = scanner.nextInt();

        Map<Integer, List<Integer>> matrixMap = new HashMap();
        System.out.println("Enter the elements of the matrix:  ");
        for (int i = 0; i < rows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                rowList.add(scanner.nextInt());
            }
            matrixMap.put(i, rowList);
        }

        System.out.println("Original Matrix is:");
        for (int i = 0; i < rows; i++) {
            List<Integer> rowList = matrixMap.get(i);
            for (int j = 0; j < cols; j++) {
                System.out.print(rowList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Transposed Matrix:");
        Map<Integer, List<Integer>> transposedMap = new HashMap<>();
        for (int i = 0; i < cols; i++) {
            List<Integer> columnList = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                columnList.add(matrixMap.get(j).get(i));
            }
            transposedMap.put(i, columnList);
        }
        for (int i = 0; i < cols; i++) {
            List<Integer> columnList = transposedMap.get(i);
            for (int j = 0; j < rows; j++) {
                System.out.print(columnList.get(j) + " ");
            }
            System.out.println();
 }}

}
