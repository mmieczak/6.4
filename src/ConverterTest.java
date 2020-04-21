public class ConverterTest {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            String dayOfWeek = CalandarConverter.convertDayToString(i + 1);
            System.out.println(i + 1 + " day of week is " + dayOfWeek);
        }
    }

}
