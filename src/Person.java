public class Person {
    private String name;
    private int birthDay;
    private int birthMonth;

    public Person(String name, int birthDay, int birthMonth) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
    }
        public String getName() {
          return name;
    }
    public int getBirthDay(){
        return birthDay;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
}