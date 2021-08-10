class Feet {
 private int feet;
 private int inches;
 private Feet feetOb;

 public Feet(int feet, int inches){
     this.feet = feet;
     this.inches = inches;
 }

 public Feet(Feet len) {
     this.feetOb = len;
 } 

// Add f1+f2 feet and store in current feet
 public void add(Feet f1, Feet f2){}

// Display a Length e.g 5�6� 
 public void print() {
    feet += feetOb.feet;
    inches += feetOb.inches;
    feet += inches/12; 
    inches %= 12;
    System.out.println(feet + "'" + inches + "\"");
 } 

 //overLoad the print method
 public void print(String msg) {
     System.out.println(msg + " " + feet + "'" + inches + "\"");
 }

 public void add(Feet f1) {
     this.feetOb = f1;
 }

 public static void print(Feet len){
     System.out.println(len.feet + "'" + len.inches + "\"");
 }

 public static Feet add(Feet f1, Feet f2, Feet f3) {
     return new Feet(f1.feet + f2.feet + f3.feet , f1.inches + f2.inches + f3.inches);
 }

}