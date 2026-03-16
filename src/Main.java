package homeworks;

public class SwitchDay {

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