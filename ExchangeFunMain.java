class ExchangeFunMain {
    public static void main(String[] args) {
      ExchangeFun et = new ExchangeFun();
      int x = 3;
      int w = 30;
  
      int temp = x;
      x= w;
      w= temp;
      //et.exchange(x, w);
      System.out.println("We want:");
      System.out.println("x = 30 w = 3");
      System.out.println("Did we get it?:");
      System.out.println ("x = " + x + "  w = " + w);
    }
  }