package ru.mirea.classes;

import ru.mirea.interfaces.*;

public class Car implements Nameable {
  private String name;
  private String color;

  /**
   * Конструктор по умолчанию
   */
  public Car() {
    this.name = "";
    this.color = "";
  }

  /**
   * Конструктор не по умолчанию
   * @param name        название машины
   * @param color       цвет машины
   */
  public Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  /**
   * Геттер для поля name
   * @return      название машины
   */
  public String getName() {
    return this.name;
  }

  /**
   * Геттер для поля color
   * @return        цвет машины
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Сеттер для поля name
   * @param name      новое название машины
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Сеттер для поля color
   * @param color       цвет машины
   */
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return      строка с информацией об объекте
   */
  @Override
  public String toString() {
    return ("Car {\n"
          + "\tname: " + this.name + "\n"
          + "\tcolor: " + this.color + "\n"
          + "}"
    );
  }
}
