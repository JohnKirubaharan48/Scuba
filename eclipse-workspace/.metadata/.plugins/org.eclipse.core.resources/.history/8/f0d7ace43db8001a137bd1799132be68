abstract class Animal { //How to acheieve abstarction in java using keyword abstract applies for Class and method level
                         //And also abstraction consits both concrete or non abstarct methods and abstarct methods
    

 

    // An abstract method
    abstract void sound();//it doesn't definition

 

    // Non Abstract Method
    int add(int a, int b) {
        System.out.println(a + b);
        return a + b;

 

    }
    
}

 

class Cat extends Animal {

 

    @Override
    void sound() {
        System.out.println("The cat sound is meow");
        
    }

 

    

 

}

 

public class AbstractionClass {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

        //Animal animal =new Animal();//Abstract class cannot be instantiated
        new Cat().sound();
        Animal animal = new Cat();
        //abstarctclassName Objrefrence child class constructor
        animal.add(4, 4);

 

    }

 

}
 