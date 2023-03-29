import java.util.Objects;

public class Person {

    private String name;

    private String fathersName;
    private String surname;

    private int age;

    private Gender gender;

    public Person(String name, String fathersName, String surname, int age, Gender gender) { // конструктор класса
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;

    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return String.format("Имя:\033[1m%s\033[0m Отчество:\033[1m%s\033[0m Фамилия: \033[1m%s\033[0m Возраст: \033[1m%d\033[0m Пол:\033[1m%s\033[0m", name, fathersName, surname, age, gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fathersName, surname, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && surname == anotherPerson.surname && age == anotherPerson.age && fathersName == anotherPerson.fathersName;
    }
}
