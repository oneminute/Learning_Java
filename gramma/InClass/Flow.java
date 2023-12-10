package gramma.InClass;

public class Flow {
    
    public static void main(String[] args) {
        byte month = 1;
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
            default:
            break;
        }

        for (int i = 0, j = 0; i < 10 && j > 0; i++, j += 5) {

        }

        int[] arr = new int[10];
        for (int i: arr) {

        }

        Flow.show(10);
        
        Flow f1 = new Flow();
        f1.show2(30);
    }

    public static void show(int i) {
        System.out.println("i = " + i);
    }

    public void show2(int i) {
        System.out.println("i = " + i);
    }
}
