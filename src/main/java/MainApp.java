public class MainApp {
    public int[] afterLastFourArray(int[] inputArray) {
        int[] afterLastFourArray = new int[0];
        for (int i = inputArray.length - 1; i < inputArray.length; i--) {
            if (inputArray[i] == 4) {
                afterLastFourArray = new int[inputArray.length - i - 1];
                System.arraycopy(inputArray, i + 1, afterLastFourArray, 0, inputArray.length - i - 1);
                break;
            } else if (i == 0) {
                throw new RuntimeException("Цифры 4 нет в массиве");
            }
        }
        return afterLastFourArray;
    }

    public boolean isOneOrFourInArray(int[] inputArray) {
        for (int number: inputArray) {
            if (number == 4 | number == 1) {
                return true;
            }
        }
        return false;
    }

}
