import java.io.Console;

public class Paint {
  public static void main(String[] args) {
    Console console = System.console();
    int frontWallHeight;
    int frontWallWidth;
    int sideWallHeight;
    int sideWallWidth;

    System.out.println("What is the height of the front wall?");
    frontWallHeight = Integer.parseInt(console.readLine());
    System.out.println("What is the width of the front wall?");
    frontWallWidth = Integer.parseInt(console.readLine());
    System.out.println("What is the height of the side wall?");
    sideWallHeight = Integer.parseInt(console.readLine());
    System.out.println("What is the width of the side wall?");
    sideWallWidth = Integer. parseInt(console.readLine());

    int houseArea = ((frontWallWidth * frontWallHeight) * 2) + ((sideWallWidth * sideWallHeight) * 2);

    System.out.println(houseArea + " sq feet");

  }
}
