import java.time.LocalDate;

public class BirthdayChecker {
    public boolean isBirthdayToday(Person person) {
        LocalDate today = LocalDate.now();
        int todayDay = today.getDayOfMonth();
        int todayMonth = today.getMonthValue();
        int personDay = person.getBirthDay();
        int personMonth = person.getBirthMonth();
        return personDay == todayDay && personMonth == todayMonth;
    }
    public String generateWish(Person person){
        return "Happy Birthday :) " + person.getName() + "May your day be filled with lots of fun and love !!";
    }
}
