import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person (" Shreemathi "  ,10,11));
        people.add(new Person(" Thalapathy "  ,5,6));
        BirthdayChecker checker = new BirthdayChecker();
        boolean anyBirthday = false;
        for(Person person : people ){
            if(checker.isBirthdayToday(person)){
                System.out.println(checker.generateWish(person));
                anyBirthday=true;
            }
        }
        if(!anyBirthday){
            System.out.println("Sorry today's not your birthday");
        }
    }
}
