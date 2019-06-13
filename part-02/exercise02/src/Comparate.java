import java.util.List;

public class Comparate {
    public boolean isBigger(int number1, int number2) {
        if (number1 > number2) {
            return true;
        }
        return false;
    }

    public boolean isSmaller(int number1, int number2) {
        if (number1 < number2) {
            return true;
        }
        return false;
    }

    public int getBiggest(List<Integer> numbers) {
        Integer biggest = numbers.get(0);
        int size = numbers.size();
        for (int positions = 1; positions < size; positions++) {
            Integer number = numbers.get(positions);
            if (biggest < number) {
                biggest = number;
            }
        }
        return biggest;
    }

    public int getSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        int size = numbers.size();
        for (int positions = 1; positions < size; positions++) {
            Integer number = numbers.get(positions);
            if (smallest > number) ;
            smallest = number;
        }
        return smallest;
    }
}


