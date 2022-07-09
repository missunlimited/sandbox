package org.AtCoder;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * あなたは、3桁の整数を入力として受け取り、それを2倍して出力するプログラムの作成を頼まれた。
 * ところが、どうやらプログラムに入力される文字列Sに英子文字が紛れ込むことがあるようだ。そこで、その場合はエラーを出力することにした。
 * Sが3桁の整数である場合(0で始まる場合を含む)はその2倍の値を出力し、そうでなければerrorと出力するプログラムを作成せよ。
 *
 * 制約
 * ・Sは長さ3の文字列である。
 * ・Sの各文字は数字または英子文字である。
 */
public class IsItaNumber {
    public void isItaNumber() {
        System.out.println("0~999までの整数を入力してください。");
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.nextLine();

        try {
            if (inputNum.length() <= 3) {
                System.out.println(Integer.parseInt(inputNum) * 2);
                return;
            }
            throw new InputMismatchException("error");
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
    }
}
