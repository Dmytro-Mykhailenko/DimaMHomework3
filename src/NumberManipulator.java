public class NumberManipulator {
    public int incrementByOne(int number){
        // return number++; так изменения не передавались
        number++;
        return number;
    }
    public int decrementByOne(int number){
        // return number--; так изменения не передавались
        number--;
        return number;
    }

}
