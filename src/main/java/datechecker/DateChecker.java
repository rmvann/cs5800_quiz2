package datechecker;

public class DateChecker {

    public boolean has31Days(Month month){
        return switch (month) {
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> false;
            default -> true;
        };
    }
}
