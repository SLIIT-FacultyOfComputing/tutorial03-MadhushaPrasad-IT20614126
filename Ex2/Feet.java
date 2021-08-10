class Feet {
 private int feet;
 private int inches;

 public Feet(int feet, int inches){
     this.feet = feet;
     this.inches = inches;
 }

 public Feet(Feet len) {
     
 } 

// Add f1+f2 feet and store in current feet
 public void add(Feet f1, Feet f2){}
// Display a Length e.g 5�6� 
 public void print() {} 

 //overLoad the print method
 public void print(String msg) {
     System.out.println(msg + " " + feet + "'" + inches + "'");
 }
}