package ovn2;

public class Person {

    public static final int FEMALE = 1;
    public static final int MALE = 2;

    String name;
    String occupation;
    int age;
    int length;
    int sex;

    public Person(String name, String occupation, int age, int length, int sex) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.length = length;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                ", length=" + length +
                ", sex=" + (sex == 1 ? "female":"male") +
                '}';
    }
}
