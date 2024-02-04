public class Main {
    public static void main(String[] args) {
        // Car
        System.out.println("// Car");
        Car car1= new Car();
        car1.brand="Mitsubishi ";
        car1.model="Lancer ";
        car1.year=2018;

        car1.startEngine();
        System.out.println(car1.brand + car1.model + car1.year);
        car1.stopEngine();

        // Calculator
        System.out.println("// Calculator");
        Calculator calc=new Calculator();

        System.out.println("Addition: " + calc.addition(13, 17));
        System.out.println("Number1 bigger than Number2: " + calc.isGreater(45.67, 45.66));

        // NumberManipulator
        System.out.println("// Number Manipulator");
        int number=5, incNumber, decNumber;


        System.out.println("Original Number = " + number);

        NumberManipulator incNum=new NumberManipulator();
        incNumber=incNum.incrementByOne(number);
        System.out.println("Incremented Number = " + incNumber);
        decNumber=incNum.decrementByOne(number);
        System.out.println("Decremented Number = " + decNumber);

        // Homework #4
        // Figure parallelepiped
        System.out.println("// Figure Volume & Area");
        Figure parallelepiped=new Figure(2.3, 1.5, 3.2);

        // Parallelepiped volume
        System.out.println("Figure Volume = " + parallelepiped.calcVolume());

        // Parallelepiped area
        System.out.printf("Figure Area = ");
        parallelepiped.figureArea();

    }
}