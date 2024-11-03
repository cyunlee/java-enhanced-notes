package enumeration.ex.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTTP CODE: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        }
    }
}