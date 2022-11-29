class CallFunc {
    public static void main(String[] args) {
      // printing 1 to 5
      p1(1);
    }
  
    static void p1(int n){
      System.out.println(n);
      p2(2);
    }
    static void p2(int n){
      System.out.println(n);
      p3(3);
    }
    static void p3(int n){
      System.out.println(n);
      p4(4);
    }
    static void p4(int n){
      System.out.println(n);
    }
  }