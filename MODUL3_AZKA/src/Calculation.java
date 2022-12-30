public class Calculation implements Runnable{
  private double radius;
  private double side;
  private double area;
  private final double phi = 3.14;

  public void setSide(double side){
    this.side = side;
  }
  public double getSide(){
    return side;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }
  public double getRadius(){
    return radius;
  }

  public void setArea(double area){
    this.area = area;
  }
  public double getArea(){
    return area;
  }

  public double getPhi(){
    return phi;
  }

  // persegi
  public void setSquare(double side) throws IllegalArgumentException{
    if(side < 1){
      throw new IllegalArgumentException("Please Enter The Number Of Sides Bigger Than Or Equal To 1");
    }
    this.area = side * side;
  }
  public double getSquare(){
    return area;
  }
  
  // lingkaran
  public void setCircle(double radius) throws IllegalArgumentException{
    if(radius < 1){
      throw new IllegalArgumentException("Please Enter The Number Of Radius Bigger Than Or Equal To 1");
    }
    this.area = phi * radius * radius;
  }
  public double getCircle(){
    return area;
  }

  // trapesium
  public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException{
    if(a < 1 | b < 1 | t < 1){
      throw new IllegalArgumentException("\nPlease Enter The Number Of Sides And Height Bigger Than Or Equal To 1");
    }
    this.area = ((a + b) * t) / 2;
  }
  public double getTrapezoid(){
    return area;
  }

  @Override
  public void run() {
    System.out.println("\n===== PROGRAM WILL START IN =====");
    for (int i = 3; i > 0; i--){
      try{
        System.out.println("Starting With Thread " + i);
        Thread.sleep(3000);
      }catch (InterruptedException e){
        System.out.println("ERROR!!!");
      }
    }
  }
}
