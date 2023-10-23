public class Person implements Comparable<Person> {
    public String firstName;
    public String secondName;
    public String thirdName;
    public int age;
    public double workExp;
    public Pol sex;



    public Person(String firstName, String secondName, String thirdName, int age, double workExp, Pol sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.age = age;
        this.workExp = workExp;
        this.sex = sex;
    }

    public double getWorkExp() {
        return workExp;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    @Override
    public String toString() {
        return "Работник: " + firstName + " " + secondName + " " + thirdName + "[" + age + "] " + "стаж: " + workExp + " года. ";
    }


    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return 1;
        } else {
            if (age < o.age) {
                return -1;
            } else {
                if (workExp > o.workExp) {
                    return 1;
                } else {
                    if (workExp < o.workExp) {
                        return -1;
                    } else
                        return thirdName.compareTo(o.thirdName);

                }
            }
        }
    }
}