import java.io.Console;

public class Door {
  int doorHeight;
  int doorWidth;
  int doorArea = doorWidth * doorHeight;
}

public class Paint {
  public static void main(String[] args) {
    Console console = System.console();
    int frontWallHeight;
    int frontWallWidth;
    int sideWallHeight;
    int sideWallWidth;
    boolean finishedDoors = false;
    boolean finishedWindows = false;

    System.out.println("What is the height of the front wall?");
    frontWallHeight = Integer.parseInt(console.readLine());
    System.out.println("What is the width of the front wall?");
    frontWallWidth = Integer.parseInt(console.readLine());
    System.out.println("What is the height of the side wall?");
    sideWallHeight = Integer.parseInt(console.readLine());
    System.out.println("What is the width of the side wall?");
    sideWallWidth = Integer. parseInt(console.readLine());

    int houseArea = ((frontWallWidth * frontWallHeight) * 2) + ((sideWallWidth * sideWallHeight) * 2);

    while (!finishedDoors){
      System.out.println("Would you like to enter a new door?");
      String doorResponse = console.readLine();
      if {

      } else (doorResponse.equals("no")){
        finishedDoors = true;
      }
    }

    System.out.println(houseArea + " sq feet");

  }
}
