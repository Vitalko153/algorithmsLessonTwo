import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        MyArrayList mal = new MyArrayList();
        for (int i = 0; i < 100000; i++) {
            mal.add(random.nextInt(50));
        }
        timeSelectionSort(mal);
        timeinsertionSort(mal);
        timeBubbleSort(mal);
    }

    public static void timeSelectionSort(MyArrayList mal){
        long start = System.currentTimeMillis();
        mal.selectionSort();
        long finish = System.currentTimeMillis();
        System.out.println("Total time selection sort: " + (finish - start) + "ms");
    }

    public static void timeinsertionSort(MyArrayList mal){
        long start = System.currentTimeMillis();
        mal.selectionSort();
        long finish = System.currentTimeMillis();
        System.out.println("Total time insert sort: " + (finish - start) + "ms");
    }

    public static void timeBubbleSort(MyArrayList mal){
        long start = System.currentTimeMillis();
        mal.selectionSort();
        long finish = System.currentTimeMillis();
        System.out.println("Total time bubble sort: " + (finish - start) + "ms");
    }

}
