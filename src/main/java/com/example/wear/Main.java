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

    public void run(){
        List<WiseSaying> sayings = new ArrayList<>();

        System.out.println("== 명언 앱 ==");
        Scanner scanner = new Scanner(System.in);

        int number=0;

        while(true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if(cmd.equals("등록")){
                System.out.print("명언 : ");
                String content = scanner.nextLine();

                System.out.print("작가 : ");
                String author = scanner.nextLine();

                number++;
                sayings.add(new WiseSaying(number, content, author));

                System.out.println(number + "번 명언이 등록되었습니다.");
            }

            if(cmd.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (int i = sayings.size() - 1; i >= 0; i--) {
                    WiseSaying saying = sayings.get(i);
                    System.out.printf("%d / %s / %s\n", saying.getNumber(), saying.getAuthor(), saying.getContent());
                }
            }

            if(cmd.equals("종료")){
                break;
            }
        }

        scanner.close();
    }

    private static class WiseSaying {
        private int number;
        private String content;
        private String author;

        public WiseSaying(int number, String content, String author) {
            this.number = number;
            this.content = content;
            this.author = author;
        }


        public int getNumber() {
            return number;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

    }
}
