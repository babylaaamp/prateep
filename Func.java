public class Func {
    int sum = 0;
    int min = 0;
    int mul = 0;
    int div = 0;

    public int Add(int num1,int num2) {
        sum = num1+num2;
        System.out.println("Summation of "+num1+ " and " +num2+ " is " +sum);
        return sum;
    }

    public int Min(int num1,int num2) {
        min = num1-num2;
        System.out.println("Subtract of "+num1+ " and " +num2+ " is " +min);
        return min;
    }

    public int Mul(int num1,int num2) {
        mul = num1*num2;
        System.out.println("Multiply of "+num1+ " and " +num2+ " is " +mul);
        return mul;
    }

    public int Div(int num1,int num2) {
        div = num1/num2;
        System.out.println("Division of "+num1+ " and " +num2+ " is " +div);
        return div;
    }
}
