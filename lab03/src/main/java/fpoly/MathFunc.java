package fpoly;

public class MathFunc {
    int calls;

    public int getCalls() {
        return calls;
    }

    public long factorial(int number){
        calls ++;
        if(number < 0 || number > 21){
            throw new IllegalArgumentException("Không được nhập số âm và phải trong khoảng 0 -> 20");
        }
        long result = 1;
        if(number > 1){
            for (int i = 1; i <= number ; i++) {
                result *= i;
            }
        }
        return result;
    }

    public long plus(int num1, int num2){
        calls++;
        return num1 + num2;
    }
}
