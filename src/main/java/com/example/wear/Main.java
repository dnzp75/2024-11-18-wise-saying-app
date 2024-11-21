package com.example.wear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {

    public void run() {
        List<WiseSaying> sayings = new ArrayList<>();

        System.out.println("== 명언 앱 ==");
        Scanner scanner = new Scanner(System.in);

        int id = 0;

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String content = scanner.nextLine();

                System.out.print("작가 : ");
                String author = scanner.nextLine();

                id++;
                sayings.add(new WiseSaying(id, content, author));

                System.out.println(id + "번 명언이 등록되었습니다.");
            }

            if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = sayings.size() - 1; i >= 0; i--) {
                    System.out.println(sayings.get(i).format());
                }
            }

            if (cmd.startsWith("삭제")) {
                String[] parts = cmd.split("\\?");
                int idToDelete = Integer.parseInt(parts[1].substring(3));

                for (int i = 0; i < sayings.size(); i++) {
                    if (sayings.get(i).matchesId(idToDelete)) {
                        sayings.remove(i);
                        System.out.println(idToDelete + "번 명언이 삭제되었습니다.");
                        break;
                    }
                }

                if (cmd.equals("종료")) {
                    break;
                }
            }

            scanner.close();
        }

    }
}

