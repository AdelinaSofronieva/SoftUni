package F09MapsLambdaAndStreamAPI.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, List<String>> companyUsersMap = new LinkedHashMap<>();

        while (!inputLine.equals("End")) {
            String company = inputLine.split(" -> ")[0];
            String userName = inputLine.split(" -> ")[1];

            if (!companyUsersMap.containsKey(company)) {
                companyUsersMap.put(company, new ArrayList<>());
                companyUsersMap.get(company).add("-- " + userName);
            } else {
                if (!companyUsersMap.get(company).contains("-- " + userName)) {
                    companyUsersMap.get(company).add("-- " + userName);
                }

            }
            inputLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyUsersMap.entrySet()) {
            System.out.printf("%s%n%s%n", entry.getKey(), String.join(System.lineSeparator(), entry.getValue()));
        }

    }
}
