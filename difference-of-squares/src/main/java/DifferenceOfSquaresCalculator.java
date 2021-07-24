import java.lang.Math;

class DifferenceOfSquaresCalculator {

    //URL: https://math.stackexchange.com/q/4063534 (version: 2021-03-16)
    int computeSquareOfSumTo(int input) {
        return (int)Math.pow(input * (input + 1) / 2, 2);        
    }

    int computeSumOfSquaresTo(int input) {
        return input*(input + 1)*(2*input + 1) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
