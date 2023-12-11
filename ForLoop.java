public class ForLoop {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 12;
        CalcNumber myFirstCalc = new CalcNumber();
        int res = myFirstCalc.addNumber(num1, num2);
        System.out.println(res);
        // for(int i = 0; i < 8; i++) {
        //     System.out.println("Day" + i);
        //     for(int j = 0; j <= 12; j++) {
        //         System.out.println("Hour" + j);
        //     }
        // }
    }
}


class CalcNumber {
    int num1 = 9;

    public int addNumber(int x, int y) {
        return x + y;
    }
    
    public void playMusic() {
        System.out.println("P laying Music....");
    }
}
