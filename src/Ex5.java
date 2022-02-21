class Point {
  double x;
  double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
}

public class Ex5 {
  public static Point midpoint(Point a, Point b) {
    return new Point(
            (a.x+b.x)/2,
            (a.y+b.y)/2
    );
  }

  public static void main(String[] args) {
    Point a = new Point(2.0, 6.0);
    System.out.println("The values of coordinates of point A: \n" +
            "x1=" + a.x +
            "\ny1=" +a.y);
    Point b = new Point(4,2);
    System.out.println("The values of coordinates of point B: \n" +
            "x2=" + b.x +
            "\ny2=" +b.y);

    Point mid = midpoint(a,b);
    System.out.println("The midpoint M between A and B has coordinates: " +
            "M("+mid.x+","+mid.y+")");

  }
}