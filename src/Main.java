public class Main {
    public static void main(String[] args) {
        // Car
        Car car1= new Car();
        car1.brand="Mitsubishi ";
        car1.model="Lancer ";
        car1.year=2018;

        car1.startEngine();
        System.out.println(car1.brand + car1.model + car1.year);
        car1.stopEngine();

        // Calcularor
        Calculator calc=new Calculator();

        System.out.println(calc.addition(13, 17));
        System.out.println(calc.isGreater(45.67, 45.66));

        // NumberManipulator
        int number, incNumber, decNumber;


        System.out.println(number=5);

        NumberManipulator incNum=new NumberManipulator();
        System.out.println(incNumber=incNum.incrementByOne(number));
        System.out.println(decNumber=incNum.decrementByOne(number));

    }
}