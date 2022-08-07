public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
//        as.sort();
        QuickSort quickSort = new QuickSort();
        as.sort(quickSort);
        BubbleSort bubbleSort = new BubbleSort();
        as.sort(bubbleSort);

        Sorting quicksort = () -> System.out.println("Quick sorting");
        System.out.println("Sorting directly using the functional interface");
        quicksort.sort();
        System.out.println("Sorting by passing the functional method as param to as.sort(Sorting)");
        as.sort(quicksort);
        Sorting bubbleSort2 = () -> System.out.println("Bubble sorting");
        bubbleSort2.sort();
        as.sort(bubbleSort2);

        as.sort(() -> System.out.println("Quick sorting"));
        as.sort(() -> System.out.println("Bubble sorting"));
        quicksort.sort();

    }

    private void sort(Sorting sorting) {//Behaviour parameterization let's us handle frequent requirement changes
        sorting.sort();
    }


}
