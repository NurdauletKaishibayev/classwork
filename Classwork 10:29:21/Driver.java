public class Driver {

  public static void main(String[] args) {
    Animal a1 = new Animal("bark", 10, "John");

    Bird b1= new Bird("Chirp", 2, "Birb", 3.24, "black");

    // Bird b2= new Animal("Hello", 4, "Carl");
    /*
    The Animal is not a bird and you cannot make any Animal Bird.
    This is because Bird is a subclass of Animal.
    */

    Animal a2= new Bird("Yo", 7, "Test", 3.1415, "red" );

    a1.speak();
    b1.speak();
    // b2.speak(); Not working because of the explanation above
    a2.speak();
  }
}
