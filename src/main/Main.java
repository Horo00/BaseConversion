package main;

import java.math.BigDecimal;

import imput.ImputNumber;
import logic.BaseConversion;

public class Main {
	public static void main(String[] args) {
		//変更したい数値を入力してもらう
		System.out.print("変更させたい数値を入力してください：");
		BigDecimal prototypeNumber = ImputNumber.getDecimal();

		//１０進数からX進数への変換のため、Xを入力してもらう
		System.out.print("変更先の進数を入力してください：");
		BigDecimal modNumber = ImputNumber.getDecimal();
		
		if(modNumber.compareTo(BigDecimal.ONE) != 1) {
			System.out.println("不正な数字です。変換できる進数を入力してください");
			modNumber = ImputNumber.getDecimal();
		}

		//prototypeNumberを10進数からmodNumber進数への変更を行う
		BigDecimal changedNumber = BaseConversion.change(prototypeNumber, modNumber);

		//結果表示
		System.out.println(prototypeNumber + "を10進数➡" + modNumber + "進数にすると");
		System.out.println("[" + changedNumber + "]　となります！");

	}
}
