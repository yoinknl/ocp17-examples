package chapter01;

public class WaterBottle {
  private String brand;
  private boolean empty;
  public static float code;
  public static String test;

  public static void main(String[] args) {
    WaterBottle wb = new WaterBottle();
    System.out.println("Empty = " + wb.empty);
    System.out.println("Brand = " + wb.brand);
    System.out.println("Code = " + code);
    System.out.println("Test = " + test);
  }
}
