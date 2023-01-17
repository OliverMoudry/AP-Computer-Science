public class RectangleDriver {

  public static void main(String[] args) {

    Rectangle r1 = new Rectangle();

    Rectangle r2 = new Rectangle(5, 12, 13);

    System.out.println(r1);
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    r1.scale(3);
    System.out.println(r1);

    /* Add code to scale r2 by some factor and print area, perimeter as above*/
    System.out.println(r2); // before scaling

    System.out.println(r2); // after scaling


  }

}
