import java.util.HashSet;
import java.util.Set;

/**
 * Создать класс Person.
 * У класса должны быть поля:
 * 1. Имя (String)
 * 2. Фамилия (String)
 * 3. Возраст (продумать тип)
 * 4. Пол
 * 5*. Придумать свои собственные поля
 *
 * Для этого класса
 * 1. Реализовать методы toString, equals и hashCode.
 * 2*. Придумать собственные методы и реализовать их
 *
 * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
 */
public class Homework6 {
    public static void main(String[] args) {

        Person person1 = new Person("Анастасия", "Анатольевна","Виноградова", 35, Gender.женский);
        Person person2= new Person("Алексей", "Иванович", "Михайлов", 45, Gender.мужской);
        Person person3 = new Person("Анастасия","Анатольевна", "Виноградова", 35, Gender.женский);
        Person person4 = new Person("Иван", "Иванович","Иванов", 18, Gender.мужской);
        Person person5 =  new Person("Иван", "Петрович","Иванов", 16, Gender.мужской);
        Person person6 = new Person("Анна", "Анатольевна","Петрова", 30, Gender.женский);

        Set<Person>persons =new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person4);
        persons.add(person3);
        persons.add(person5);
        persons.add(person6);


        for(Person person: persons){ if (person.getAge() > 20) { System.out.println(person);}}

    }

}
