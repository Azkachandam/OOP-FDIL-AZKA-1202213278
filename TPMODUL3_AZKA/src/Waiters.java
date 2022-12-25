public class Waiters implements Runnable {
  private final int orderQty;
  private final int customerID;
  static int foodPrice = 25000;

  public Waiters(int customerID, int orderQty) {
      this.customerID = customerID;
      this.orderQty = orderQty;
  }

  @Override
  public void run() {
      while (true) {
          getFood();
          try {
              Thread.sleep(5000);
          }
          catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
  public void orderInfo() {
      System.out.println("");
      System.out.println("==========================================================");
      System.out.println("Customer ID: " + this.customerID);
      System.out.println("Numbeer Of Food: " + this.orderQty);
      System.out.println("Total Price: " + this.orderQty * foodPrice);
      System.out.println("==========================================================");
  }
  public void getFood() {
      synchronized(Restaurant.getlock()) {
          System.out.println("Waiter: Food Is Ready To Deliver");
          Restaurant makanan = new Restaurant();
          makanan.setWaitingForPickup(false);

          if (Restaurant.getFoodNumber() == this.orderQty + 1) {
              orderInfo();
              System.exit(0);
          }
          Restaurant.getlock().notifyAll();
          System.out.println("Waiter: Tell The Restaurant To Make Food\n");
      }
  }
}