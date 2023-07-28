public class app {
    public static void main(String[] args) {
        int arr[] = {70,61,72,83,38};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("\nAfter sorting");
        bubbleSort sortFnc = new bubbleSort();
        int arr2[] = sortFnc.bubbleSort(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
            //test
        }
    }
}