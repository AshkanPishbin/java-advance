public class FizzBuzz {

    public String fizzBuzz(Integer number) {
        if (number % 15 == 0) {
            return "fizzBuzz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        } else
            return number.toString();
    }
}


//Define the fizzBuzz action that receives a number and returns a word depending
// on some factors. The action returns Fizz if the number is multiple of three
// and Buzz if it is a multiple of five. For numbers that are multiples of both
// three and five it returns Multiplication. For numbers that are either, then it just
// returns the number as text.
//Write a code that asks for a number, applies the fizzBuzz action and says the
// result.


