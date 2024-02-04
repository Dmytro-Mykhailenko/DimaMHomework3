public class NumberManipulator {
    public int incrementByOne(int number){
        return ++number; // почитал немного про постфиксный и префиксный инкремент..
        // префиксный инкремент будет сразу менять знвчение и потом работает return
        // постфиксный менять значение в данном случае не будет
        // так как return закончит метод и вернет неизмененный number
        // до оператора инкремент.
    }
    public int decrementByOne(int number){
        return --number;
    }

}
