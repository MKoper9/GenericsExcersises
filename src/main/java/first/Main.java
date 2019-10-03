package first;

public class Main {

    /*Napisz jedną uniwersalną metodę generyczną, która przyjmuje Integer[] lub Double[] lub Character[]
    i wyświetla wszystkie elementy z tablicy na konsoli.

     */

    public static void main(String[] args) {

        Double[]a = {1.11,2.44,1.78,8.55};
        String[]b={"eins","zwei","drei","vier"};

        arrayToWrite(a);
        System.out.println("\n");
        arrayToWrite(b);


    }
    public static <T> void arrayToWrite(T[]array)
    {
        for (T element: array
             ) {
            System.out.println(element);

        }
    }

}
