class FeetTest {
    public static void main(String[] args) {
    
    //q->ii.
    Feet mylength = new Feet(5,6);
    mylength.print("Length : "); // should print Length : 5'6"

    //q->iv.
	Feet newlen = new Feet(6,7);
	mylength.add(newlen);
	mylength.print(); // 12'1"

    //q->v
    Feet.print(mylength);

    //q->vii
    Feet f1 = new Feet(1,2);
    Feet f2 = new Feet(3,4);
    Feet f3 = new Feet(5,6);
    Feet f5 = Feet.add(f1, f2, f3);
    }
}
   