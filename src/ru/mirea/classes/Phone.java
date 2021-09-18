package ru.mirea.classes;

import ru.mirea.interfaces.*;

public class Phone implements Nameable {
  private String name;
  private String os;
  private double ramSize;

  /**
   * Конструктор по умолчанию
   */
  public Phone() {
    this.name = "";
    this.os = "";
    this.ramSize = 0.0;
  }

  /**
   * Конструктор не по умолчанию
   * @param name          название телефона
   * @param os            операционная система
   * @param ramSize       объём оперативной памяти
   */
  public Phone(String name, String os, double ramSize) {
    this.name = name;
    this.os = os;
    this.ramSize = ramSize;
  }

  /**
   * Геттер для поля name
   * @return    название телефона
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * Геттер для поля os
   * @return      операционная система
   */
  public String getOs() {
    return this.os;
  }

  /**
   * Геттер для поля ramSize
   * @return      объём оперативной памяти
   */
  public double getRamSize() {
    return this.ramSize;
  }

  /**
   * Сеттер для поля name
   * @param name      новое название телефона
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Сеттер для поля os
   * @param os    операционная система
   */
  public void setOs(String os) {
    this.os = os;
  }

  /**
   * Сеттер для поля ramSize
   * @param ramSize       новый объём оперативной памяти
   */
  public void setRamSize(double ramSize) {
    this.ramSize = ramSize;
  }

  /**
   * Объединяет всю информацию об объекте в одну строку
   * @return      строка с информацией об объекте
   */
  @Override
  public String toString() {
    return ("Phone {\n"
      + "\tname: " + this.name + "\n"
      + "\tOS: " + this.os + "\n"
      + "\tramSize: " + this.ramSize + "\n"
      + "}"
    );
  }
}
