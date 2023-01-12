package J02MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = scanner.nextLine().split("\\s+");
        }

        List<Integer> queenPosition = new ArrayList<>();
        boolean ifAlreadyContainsQueen = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                String currentSymbol = matrix[r][c];

                if (currentSymbol.equals("q")) {
                    if (queenPosition.size() == 0) {
                        queenPosition.add(r);
                        queenPosition.add(c);
                        ifAlreadyContainsQueen = false;
                    }

//                    int n = 1;
//                    int row = r - n;
//                    int col = c;
//                    findIfRealQueen(matrix, queenPosition, row, col, n, ifAlreadyContainsQueen); //up
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r - n, c + n, n, ifAlreadyContainsQueen); //upright
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r, c + n, n, ifAlreadyContainsQueen); //right
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r + n, c + n, n, ifAlreadyContainsQueen); //downright
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r + n, c, n, ifAlreadyContainsQueen); //down
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r + n, c - n, n, ifAlreadyContainsQueen); //downleft
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r, c - n, n, ifAlreadyContainsQueen); //left
//                    n = 1;
//                    findIfRealQueen(matrix, queenPosition, r - n, c - n, n, ifAlreadyContainsQueen); //uplef
                    int n = 1; //up
                    while (r - n >= 0 && r - n < matrix.length && c >= 0 && c < matrix.length) {
                        String upFromCurrentSymbol = matrix[r - n][c];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //upright
                    while (r - n >= 0 && r - n < matrix.length && c + n >= 0 && c + n < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r - n][c + n];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //right
                    while (r >= 0 && r < matrix.length && c + n >= 0 && c + n < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r][c + n];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //downright
                    while (r + n >= 0 && r + n < matrix.length && c + n >= 0 && c + n < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r + n][c + n];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //down
                    while (r + n >= 0 && r + n < matrix.length && c >= 0 && c < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r + n][c];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //downleft
                    while (r + n >= 0 && r + n < matrix.length && c - n >= 0 && c - n < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r + n][c - n];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //left
                    while (r >= 0 && r< matrix.length && c - n >= 0 && c - n < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r][c - n];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }

                    n = 1; //uplef
                    while (r - n >= 0 && r - n < matrix.length && c - n >= 0 && c - n < matrix.length && !ifAlreadyContainsQueen) {
                        String upFromCurrentSymbol = matrix[r - n][c - n];
                        if (upFromCurrentSymbol.equals("q")) {
                            queenPosition.remove(1);
                            queenPosition.remove(0);
                            ifAlreadyContainsQueen = true;
                            break;
                        }
                        n++;
                    }


                }
                if (!ifAlreadyContainsQueen && queenPosition.size() > 0) {
                    break;
                }
            }
            if (!ifAlreadyContainsQueen  && queenPosition.size() > 0) {
                break;
            }
        }

        //System.out.println(queenPosition);

        System.out.println(queenPosition.toString().replaceAll("[\\[\\],]", ""));
    }

//    private static List<Integer> findIfRealQueen(String[][] matrix, List<Integer> queenPosition, int r, int c, int n, boolean ifAlreadyContainsQueen) {
//
//        while (r >= 0 && r < matrix.length && c >= 0 && c < matrix.length) {
//            String upFromCurrentSymbol = matrix[r][c];
//            if (upFromCurrentSymbol.equals("q")) {
//                queenPosition.remove(1);
//                queenPosition.remove(0);
//                ifAlreadyContainsQueen = true;
//                break;
//            }
//            n++;
//
//        }
//
//        return queenPosition;
//    }

    private static boolean isValidIndex(String[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;

    }
}

