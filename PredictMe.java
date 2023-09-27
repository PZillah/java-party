import java.util.ArrayList;

public class PredictMe {

    public static void main(String[] args) {

        System.out.println("hello world!");

        for (int i = 0; i < 5; i++)
            System.out.println(i);

        ArrayList<String> list = new ArrayList<String>();
        for (String s: "hello".split("")) {
            list.add(s);
            System.out.println("Adding " + s);
        } 
        System.out.println(list);
    }
}
