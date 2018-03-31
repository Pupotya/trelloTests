package exam;


public class FindCount {

    public static void main(String[] args) {

        System.out.println(counter());

    }

    static int counter() {
        final int[] array = {1, 1, 4, 5, 1, 1, 3, 1, 3, 2};
        int equalsCount = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            equalsCount++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                    break;
                }
            }
        }
        return equalsCount - count;
    }

}
