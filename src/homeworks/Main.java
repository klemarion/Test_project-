package homeworks;

public class Main {

        public static void main(String[] args) {

            String day = "Monday";

            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    System.out.println("Робочий день");
                    break;

                case "Saturday":
                case "Sunday":
                    System.out.println("Вихідний день");
                    break;
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int result = linearSearch(arr, 7);

        System.out.println(result);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}