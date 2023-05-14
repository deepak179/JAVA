public class Switch {
    public static void main(String[] args) {
        int n = 5;
        String day = "None";

        switch (n) 
        {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                System.out.println("Please enter a valid day");

        }
        System.out.println(day);
    }
}
