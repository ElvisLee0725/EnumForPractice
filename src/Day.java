public enum Day {
    SUNDAY(7, "Church Day!"),
    MONDAY(1, "Worst day of a week"),
    TUESDAY(2, "Even worse than Monday"),
    WEDNESDAY(3, "Middle of the week"),
    THURSDAY(4, "Almost Friday"),
    FRIDAY(5, "Happy Friday!"),
    SATURDAY(6, "Take a break");

    int day;
    String message;

    Day(int day, String message) {
        this.day = day;
        this.message = message;
    }
}
