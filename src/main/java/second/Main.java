package second;

import java.util.List;

public class Main {

    /*2. Przygotuj klasę, a w niej jedną metodę, która powinna przyjąć dowolną tablicę i zwrócić listę typu tablicy.
     Przykładowo jeśli do klasy przekazywana jest tablica Integer[] to metoda zwraca listę List<Integer>.
     Zwracana lista powinna zawierać wszystkie elementy Listy Skorzystaj z metody add w celu dodania elementów tablicy do listy.
     */

    public static void main(String[] args) {

        Integer[] a = {1,2,3,45,6};
        String[]b ={"kotek", "piesek","kózka"};
        Integer[]c ={994,112,997,911} ;

        ArrayToList array = new ArrayToList();
        List<Integer> list=array.convert(a);


        System.out.println(list);


    }
}
