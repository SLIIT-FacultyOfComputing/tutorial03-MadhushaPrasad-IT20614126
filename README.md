
![logo](/Resources/tutelogo.png)

## <div align="center">Tutorial 02</div>

## Objectives : 



## Exercise 1 

**Q. Implement a class called Calculation with two static methods that calculate the addition of two 
numbers the subtraction of two numbers.**
	i. Implement a class called DemoApp and in the main function call the two methods directly without creating objects. 

## Exercise 2 

**Q1.  Implement the following class**

```
	class Feet {
 		private int feet;
 		private int inches;
 		public Feet(int feet, int inches){}
		// Add f1+f2 feet and store in current feet
 		public void add(Feet f1, Feet f2){}
		// Display a Length e.g 5’6” 
		public void print() {} 
	}
```

    i. Write a separate program and a main function to test the above class
    ii. Overload the print() function to add a message to be printed in front of the length.
```
    public void print(String msg) {}
    e.g. 
    Feet mylength = new Feet(5,6);
    mylength.print(“Length : “); // should print Length : 5’6”
```
	iii. Implement an overloaded constructor that can accept another Feet object
```
	public Feet(Feet len) {} 
	// Copy the content of len to the new Feet Object.
```
	iv.  Implement an overloaded add method that adds the current length to the new length and stores it in the current Feet object.
```
	public void add(Feet f1) {}
	e.g.
	Feet mylength = new Feet(5,6);
	Feet newlen = new Feet(6,7)
	mylength.add(newlen);
	mylength.print(); // 12’2”
```
	
	v.Implement a static print method for Feet so that any Feet object can be printed using the static method.
```public static print(Feet f) {}
		e.g.
		Feet mylength = new Feet(5,6);
		Feet.print(mylength);
```
	
	vi. Why can’t you have the following static add() method, here we want to return a Feet object.
```public static Feet add(Feet f1, Feet f2){}```
	
	vii.Instead implement the following static add() method which is used to add three Feet objects and return a new Feet object
```
	public static Feet add(Feet f1, Feet f2, Feet f3) {}
	e.g.
	Feet f5 = Feet.add(f1, f2, f3);
```
	
	viii.  Implement println() versions of the print() methods that you have implemented.

