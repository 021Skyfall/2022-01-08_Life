package Main;

public class delimiter {
    private static String del = "";

    public static void main(String[] args) {
        del = "!!!!!";
        A();
        B();
        del = "@@@@@";
        A();
        B();
        del = "?!?!?!?";
        B();
        A();
    }

    private static void A () {
        System.out.println(del + " A");
    }
    private static void B () {
        System.out.println(del + " B");
    }
}

