public class Main {
    public static void main(String[] args) {
        // functional (5!  1, 2, 3, 4, 5)
        //increase input(5) by exponents (1-5)
        //add all the exponents and print the result
        //5+25+125+625+3125

        int input = 5;
        double result = 0;
        double sum = 0;

        for(int i = 1; i <= 5; i++ ){
            //saves the exponent in result variable
            result = Math.pow(input, i);

            //recursively adds exponent to the sum
            sum = sum + result;
        }

        System.out.println(sum);
    }
}