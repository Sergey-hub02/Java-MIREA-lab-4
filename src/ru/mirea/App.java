package ru.mirea;

import java.util.Scanner;

import ru.mirea.classes.*;
import ru.mirea.interfaces.*;

public class App {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    Nameable[] goods = new Nameable[4];

    goods[0] = new Car("Toyota Corolla", "red");
    goods[1] = new Car("Subaru", "blue");
    goods[2] = new Phone("Huawei P20 Lite", "Android Oreo", 2.0);
    goods[3] = new Phone("Samsung Galaxy Tab 2", "Android", 1.0);

    System.out.println("Список доступных товаров:");

    for (int i = 0; i < goods.length; ++i) {
      System.out.println((i + 1) + ") " + goods[i].getName());
    }

    System.out.println();
    System.out.println("О каком товаре вы хотите узнать больше?");
    System.out.print("Введите номер товара (1-4): ");

    int goodIndex = IN.nextInt();

    System.out.println();
    System.out.println(goods[goodIndex - 1]);
  }
}
