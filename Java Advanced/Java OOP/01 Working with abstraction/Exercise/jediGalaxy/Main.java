package J01WorkingWithAbstraction.Exercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] galaxySizeArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int galaxyRow = galaxySizeArr[0];
            int galaxyCol = galaxySizeArr[1];

            int[][] galaxyMatrix = new int[galaxyRow][galaxyCol];

            Galaxy galaxy = new Galaxy(galaxyRow, galaxyCol);
            galaxy.fillGalaxy(galaxyRow, galaxyCol, galaxyMatrix);

        //fillGalaxy(galaxyRow, galaxyCol, galaxyMatrix);

        String command = scanner.nextLine();
            long sum = 0;
            while (!command.equals("Let the Force be with you"))
            {
                int[] positionOfIvo = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
                int[] positionOfEvil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int evilRow = positionOfEvil[0];
                int evilCol = positionOfEvil[1];

                evilPowerMovesAndDestroysStars(galaxyMatrix, evilRow, evilCol);

                int rowOfIvo = positionOfIvo[0];
                int colOfIvo = positionOfIvo[1];

                sum = moveOfIvoAndCollectingStars(galaxyMatrix, sum, rowOfIvo, colOfIvo);

                command = scanner.nextLine();
            }

        System.out.println(sum);


    }

    private static long moveOfIvoAndCollectingStars(int[][] galaxy, long sum, int rowOfIvo, int colOfIvo) {
        while (rowOfIvo >= 0 && colOfIvo < galaxy[1].length)
        {
            if (rowOfIvo < galaxy.length && colOfIvo >= 0 && colOfIvo < galaxy[0].length)
            {
                sum += galaxy[rowOfIvo][colOfIvo];
            }

            colOfIvo++;
            rowOfIvo--;
        }
        return sum;
    }

    private static void evilPowerMovesAndDestroysStars(int[][] galaxy, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0)
        {
            if (evilRow < galaxy.length && evilCol < galaxy[0].length)
            {
                galaxy[evilRow] [evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

//    private static void fillGalaxy(int galaxyRow, int galaxyCol, int[][] galaxy) {
//        int starValue = 0;
//        for (int row = 0; row < galaxyRow; row++)
//        {
//            for (int col = 0; col < galaxyCol; col++)
//            {
//                galaxy[row][col] = starValue++;
//            }
//        }
//    }
}
