package com.example.wear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class App {
    public void run(){
        System.out.println("== 명언 앱 ==");
        Scanner scanner = new Scanner(System.in);

        int number=0;

        while(true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if(cmd.equals("등록")){
                System.out.print("명언 : ");
                scanner.nextLine();

                System.out.print("작가 : ");
                scanner.nextLine();

                number++;

                System.out.println(number + "번 명언이 등록되었습니다.");
            }

            if(cmd.equals("종료")){
                break;
            }
        }

        scanner.close();
    }
}
