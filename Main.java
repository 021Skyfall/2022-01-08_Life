import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello\nJava\nWorld!");
        f1.close();

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("넌\n누구냐...");
        f2.close();

//        F3 f3 = new F3();
//        f3.setA("What the hell ");
//        f3.setB(11);
//        System.out.println(f3.getA());
//        System.out.println(f3.getB());
//        f3.Write(); 
        // getter setter 복습
        
        F3 f3 = new F3("wowooowoo ",22);
        f3.write();
        // 생성자 복습 ~> 근데 이거 private 인데 생성자로 데이터 변경이 되네?
        // 매개변수 쓰냐 안쓰냐 차이인가
        // 아 그게 아니라 캡슐화로 값 나눠서 부를때 차이인가
    }
}
class F3 {
    private String a;
    private int b;

    public void write () throws IOException {
        FileWriter fileWriter = new FileWriter("data3.txt");
        fileWriter.write(a+b+"\n"+"Yeah wusup");
        fileWriter.close();
    }

    public F3(String a, int b) {
        this.a = a;
        this.b = b;
    }


//    public String getA() {
//        return a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setA(String a) {
//        this.a = a;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
}