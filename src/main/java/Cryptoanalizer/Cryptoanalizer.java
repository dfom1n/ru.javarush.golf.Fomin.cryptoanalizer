package Cryptanalysis13;

import java.io.IOException;
import java.util.Scanner;

import static Cryptanalysis13.Encryptor.*;

public class Cryptanalysis {
    public static void main(String[] args) throws IOException {
        System.out.println("Здравствуйте");
        System.out.println("Меня зовут JavaRush, я лучший в критографии");
        System.out.println("1. Я умею зашивровывать текст методом Цезаря");
        System.out.println("2. Я умею расшифровывать текст методом Цезаря");
        System.out.println("3. Я умею взламывать зашифрованный текст методом Цезаря");
        System.out.println("Введите номер пункта для начало работы со мной!");
        Scanner scanner = new Scanner(System.in);
        int programNumber = scanner.nextInt();
        if (programNumber > 0 && programNumber < 4) {
            System.out.printf("Вы выбрали программу %d", programNumber);
            System.out.println("");
            System.out.println("Ответьте на несколько уточняющих вопросов и я все сделаю");
            switch (programNumber) {
                case 1:
                    Encryptor.encrypt();
                    break;
                case 2:
                    Decoder.decoder();
                    break;
                case 3:
                    Hacking.hacking();
                    break;
            }
        } else {
            System.out.println("Запустите программу заново");
            System.out.println("И введите число от 1 до 3");
        }
    }
}





