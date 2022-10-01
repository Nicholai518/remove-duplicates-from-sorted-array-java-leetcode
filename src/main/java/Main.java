public class Main {
    public static void main(String[] args) {
        int[] arrayOne = new int[]{1, 1, 2};
        int[] arrayTwo = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] arrayThree = new int[]{0, 1, 2, 3, 4, 5};
        int[] arrayFour = new int[]{0, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5};

        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(arrayOne));
        System.out.println(solution.removeDuplicates(arrayTwo));
        System.out.println(solution.removeDuplicates(arrayThree));
        System.out.println(solution.removeDuplicates(arrayFour));
    }
}
