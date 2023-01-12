package J06DefiningClasses.Lab.P03BankAccount;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = scanner.nextLine();
        Map<Integer, BankAccount> accountsMap = new LinkedHashMap<>();

        while (!commands.equals("End")) {
            String command = commands.split("\\s+")[0];
            BankAccount bankAccount;

            switch (command) {
                case "Create" :
                    bankAccount = new BankAccount();
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    accountsMap.put(bankAccount.getId(), bankAccount);
                    break;
                case "Deposit" :
                    int accountDepositId = Integer.parseInt(commands.split("\\s+")[1]);
                    double money = Double.parseDouble(commands.split("\\s+")[2]);

                    if (accountsMap.containsKey(accountDepositId)) {
                        bankAccount = accountsMap.get(accountDepositId);
                        bankAccount.deposit(money);
                        accountsMap.put(accountDepositId, bankAccount);
                        System.out.printf("Deposited %.0f to ID%d%n", money, accountDepositId);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest" :
                    double interestRate = Double.parseDouble(commands.split("\\s+")[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;

                case "GetInterest" :
                    int accountGetInterestId = Integer.parseInt(commands.split("\\s+")[1]);
                    int years = Integer.parseInt(commands.split("\\s+")[2]);

                    if (accountsMap.containsKey(accountGetInterestId)) {
                        bankAccount = accountsMap.get(accountGetInterestId);
                        double totalInterest = bankAccount.getInterest(years);
                        System.out.printf("%.2f%n", totalInterest);

                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            commands = scanner.nextLine();
        }
    }
}
