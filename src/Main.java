import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Иванович", "Иванов", 50, 30,Pol.MAN);
        Person person2 = new Person("Пётр", "Петрович", "Петров", 25, 0.75,Pol.MAN);
        Person person3 = new Person("Сидор", "Сидорович", "Сидоров", 45, 5,Pol.MAN);
        Person person4 = new Person("Александра", "Александровна", "Александрова", 55, 25,Pol.WOMAN);
        Person person5 = new Person("Дмитрий", "Дмитриевич", "Дмитров", 40, 22,Pol.MAN);
        Person person6 = new Person("Павел", "Павлович", "Павлов", 35, 15,Pol.MAN);
        Person person7 = new Person("Александр", "Александрович", "Александров", 60, 40,Pol.MAN);
        Person person8 = new Person("Филипп", "Филиппович", "Филиппов", 70, 45,Pol.MAN);
        Person person9 = new Person("Андрей", "Андреевич", "Андреев", 66, 19,Pol.MAN);
        Person person10 = new Person("Николай", "Николаевич", "Николаев", 30, 12,Pol.MAN);
        Person person11 = new Person("Ирина", "Николаевна", "Смирнова", 22, 0.5,Pol.WOMAN);
        Person person12 = new Person("Сергей", "Сергеевич", "Сергеев", 45, 23,Pol.MAN);
        Person person13 = new Person("Борис", "Борисович", "Борисов", 68, 45,Pol.MAN);
        Person person14 = new Person("Анна", "Борисовна", "Борисова", 38, 15,Pol.WOMAN);
        List<Person> list = new ArrayList<>(List.of(person1, person2, person3, person4, person5, person6, person7, person8, person9, person10, person11, person12, person13, person14));
        List<Person> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if (p.getWorkExp() < 1) {
                newList.add(p);
            }
        }
        System.out.println("Стаж меньше года: ");
        System.out.println(newList);


        List<Person> newOneList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if (p.sex == Pol.MAN && p.age>=65 && p.workExp>=20 || p.sex == Pol.WOMAN && p.age>=60 && p.workExp>=20){
                newOneList.add(p);
            }
        }
        System.out.println("Пора на пенсию: ");
        System.out.println(newOneList);

        System.out.println("Сортировка: ");
        list.sort(new PersonAgeComparator());
        System.out.println(list);

    }
}
