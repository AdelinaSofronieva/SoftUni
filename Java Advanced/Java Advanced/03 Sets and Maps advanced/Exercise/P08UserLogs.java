package J03SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class P08UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, Map<String, Integer>> usersMap = new TreeMap<>();

        while (!inputLine.equals("end")) {
            String[] commands = inputLine.split(" ");
            String ipAddress = commands[0].substring(3);
            String user = commands[2].substring(5);

            usersMap.putIfAbsent(user, new LinkedHashMap<>());

            if (!usersMap.get(user).containsKey(ipAddress)) {
                usersMap.get(user).put(ipAddress, 1);
            } else {
                int currentCount = usersMap.get(user).get(ipAddress) + 1;
                usersMap.get(user).put(ipAddress, currentCount);
            }

            inputLine = scanner.nextLine();
        }

        for (var entry : usersMap.entrySet()) {
            String user = entry.getKey();
            System.out.println(user + ": ");
            Map<String, Integer> ipAddresses = entry.getValue();
            StringBuilder ipAddressesBuilder = new StringBuilder();

            for (var ipAddress : ipAddresses.entrySet()) {
//                String ip = ipAddress.getKey();
//                int count = ipAddress.getValue();
//                ipAddressesBuilder.append(ip);
//                ipAddressesBuilder.append(" => ");
//                ipAddressesBuilder.append(count);
//                ipAddressesBuilder.append(",\n");

                String formattedAttack = String.format("%s => %s, ", ipAddress.getKey(),
                        ipAddress.getValue());
                ipAddressesBuilder.append(formattedAttack);

                //ipAddressesBuilder.append(String.format("%s => %d,\n", ipAddress.getKey(), ipAddress.getValue()));
            }
            String output = ipAddressesBuilder.substring(0, ipAddressesBuilder.length() - 2);
            output += ".";
            System.out.println(output);
        }
    }
}
