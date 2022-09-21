package F04Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {
            String currentCommand = command[0];


            switch (currentCommand) {
                case "exchange":
                    int indexToExchange = Integer.parseInt(command[1]);
                    int[] result = exchangeArray(numArr, indexToExchange);
                    break;
                case "max":
                    String maxOddOrEven = command[1];
                    if (maxOddOrEven.equals("even")) {
                        findMaxEvenIndex(numArr);
                    } else {
                        findMaxOddIndex(numArr);
                    }
                    break;
                case "min":
                    String minOddOrEven = command[1];
                    if (minOddOrEven.equals("even")) {
                        findMinEvenIndex(numArr);
                    } else {
                        findMinOddIndex(numArr);
                    }
                    break;
                case "first":
                    int countFirstElements = Integer.parseInt(command[1]);
                    String firstOddOrEven = command[2];
                    if (firstOddOrEven.equals("odd")) {
                        findFirstCountOddElements(numArr,countFirstElements);
                    } else {
                        findFirstCountEvenElements(numArr,countFirstElements);
                    }
                    break;
                case "last":
                    int countLastElements = Integer.parseInt(command[1]);
                    String lastOddOrEven = command[2];
                    if (lastOddOrEven.equals("odd")) {
                        findLastCountOddElements(numArr,countLastElements);
                    } else {
                        findLastCountEvenElements(numArr,countLastElements);
                    }
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        System.out.println(Arrays.toString(numArr));    }

    public static int[] exchangeArray(int[] numArr, int indexToExchange) {
        if (indexToExchange > numArr.length || indexToExchange < 0) {
            System.out.println("Invalid index");
        } else if (indexToExchange < numArr.length) {
            int[] partBeforeIndex = new int[indexToExchange + 1];
            int[] partAfterIndex = new int[numArr.length - partBeforeIndex.length];
            for (int i = 0; i <= indexToExchange; i++) {
                partBeforeIndex[i] = numArr[i];
            }
            for (int i = 0; i < partAfterIndex.length; i++) {
                partAfterIndex[i] = numArr[indexToExchange + 1 + i];
            }

            for (int i = 0; i < partAfterIndex.length; i++) {
                numArr[i] = partAfterIndex[i];
            }

            for (int i = 0; i < partBeforeIndex.length; i++) {
                numArr[partAfterIndex.length + i] = partBeforeIndex[i];
            }

        }
        return numArr;
    }

    public static void findMaxEvenIndex(int[] numArr) {
        int index = 0;
        int maxNum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0 && numArr[i] >= maxNum) {
                maxNum = numArr[i];
                index = i;
            } else {
                count++;
            }
        }

        if (count == numArr.length) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void findMaxOddIndex(int[] numArr) {
        int index = 0;
        int maxNum = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 1 && numArr[i] >= maxNum) {
                maxNum = numArr[i];
                index = i;
            } else {
                count++;
            }
        }

        if (count == numArr.length) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void findMinEvenIndex(int[] numArr) {
        int index = 0;
        int minNum = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0 && numArr[i] <= minNum) {
                minNum = numArr[i];
                index = i;
            } else {
                count++;
            }
        }

        if (count == numArr.length) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void findMinOddIndex(int[] numArr) {
        int index = 0;
        int minNum = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 1 && numArr[i] <= minNum) {
                minNum = numArr[i];
                index = i;
            } else {
                count++;
            }
        }

        if (count == numArr.length) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void findFirstCountOddElements(int[] numArr, int countFirstOddElements) {
        if (countFirstOddElements > numArr.length) {
            System.out.println("Invalid count");
        } else {
            String findOddElements = "";
            int countOddElements = 0;
            for (int i = 0; i < numArr.length; i++) {
                if (numArr[i] % 2 == 1) {
                    if (countOddElements >= countFirstOddElements) {
                        break;
                    }
                    findOddElements += numArr[i] + " ";
                    countOddElements++;

                }
            }
            String[] findOddElementsArr = findOddElements.split(" ");
            if (findOddElementsArr.length > 0) {
                System.out.println(Arrays.toString(findOddElementsArr));
            } else {
                System.out.println("[]");
            }
        }
    }

    public static void findFirstCountEvenElements(int[] numArr, int countFirstEvenElements) {
        if (countFirstEvenElements > numArr.length) {
            System.out.println("Invalid count");
        } else {
            String findEvenElements = "";
            int countEvenElements = 0;
            for (int i = 0; i < numArr.length; i++) {
                if (countEvenElements >= countFirstEvenElements) {
                    break;
                }
                if (numArr[i] % 2 == 0) {

                    findEvenElements += numArr[i] + " ";
                    countEvenElements++;

                }
            }
            String[] findEvenElementsArr = findEvenElements.split(" ");
            if (findEvenElementsArr.length > 0) {
                System.out.println(Arrays.toString(findEvenElementsArr));
            } else {
                System.out.println("[]");
            }
        }
    }

    public static void findLastCountOddElements(int[] numArr, int countLastOddElements) {
        if (countLastOddElements > numArr.length) {
            System.out.println("Invalid count");
        } else {
            String findOddElements = "";
            int countOddElements = 0;
            for (int i = numArr.length - 1; i >= 0; i--) {
                if (numArr[i] % 2 == 1) {
                    if (countOddElements >= countLastOddElements) {
                        break;
                    }
                    findOddElements += numArr[i] + " ";
                    countOddElements++;

                }
            }
            String[] findOddElementsArr = findOddElements.split(" ");
            String[] reversedFindOddElementsArr = new String[findOddElementsArr.length];
            int count = 0;
            if (findOddElementsArr.length > 0) {
                for (int i = findOddElementsArr.length - 1; i >= 0 ; i--) {
                    reversedFindOddElementsArr[count] = findOddElementsArr[i];
                    count++;
                }
                System.out.println(Arrays.toString(reversedFindOddElementsArr));

            } else {
                System.out.println("[]");
            }
        }
    }

    public static void findLastCountEvenElements(int[] numArr, int countLastEvenElements) {
        if (countLastEvenElements > numArr.length) {
            System.out.println("Invalid count");
        } else {
            String findEvenElements = "";
            int countOddElements = 0;
            for (int i = numArr.length - 1; i >= 0; i--) {
                if (countOddElements >= countLastEvenElements) {
                    break;
                }
                if (numArr[i] % 2 == 0) {

                    findEvenElements += numArr[i] + " ";
                    countOddElements++;

                }
            }
            String[] findEvenElementsArr = findEvenElements.split(" ");
            String[] reversedFindEvenElementsArr = new String[findEvenElementsArr.length];
            int count = 0;
            if (findEvenElementsArr.length > 0) {
                for (int i = findEvenElementsArr.length - 1; i >= 0 ; i--) {
                    reversedFindEvenElementsArr[count] = findEvenElementsArr[i];
                    count++;
                }
                System.out.println(Arrays.toString(reversedFindEvenElementsArr));
            } else {
                System.out.println("[]");
            }
        }
    }
}
