public class bubbleSort {
    public int[] bubbleSort(int[] intArr){
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]){
                    int tempInt = intArr[j];
                    intArr[j] = intArr[j +1];
                    intArr[j+1] = tempInt;
                }
            }
        }

        return intArr;
    }
}
