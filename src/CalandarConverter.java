public class CalandarConverter {

    private static final short MONDAY = 1;
    private static final short TUESDAY = 2;
    private static final short WEDNESDAY = 3;
    private static final short THURSDAY = 4;
    private static final short FRIDAY = 5;
    private static final short SATURDAY = 6;
    private static final short SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        return switch (dayNumber) {
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
            case SUNDAY -> "Sunday";
            default -> "Week has 7 days only";
        };
    }

}
