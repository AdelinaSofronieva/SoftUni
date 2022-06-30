package F08ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    static class Songs {
        String typeList;
        String name;
        String time;



        Songs (String type, String name, String time) {
            this.typeList = type;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Songs> songList = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs; i++) {
            String[] inputLine = scanner.nextLine().split("_");

            String type = inputLine[0];
            String name = inputLine[1];
            String time = inputLine[2];

            Songs currentSong = new Songs(type, name, time);

            songList.add(currentSong);

        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Songs item: songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Songs item: songList) {
                if (command.equals(item.getTypeList())) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
