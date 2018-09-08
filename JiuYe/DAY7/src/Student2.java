import java.util.Objects;

//.定义Student类，包含姓名：String name、年龄：int age、成绩：int score，生成空参、有参构造、set和get方
public class Student2 {
    private String name;
    private int age;
    private int score;

    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        this.age = age;
        if(age<0||age>200){
            throw new IllegalAgeException("HAH");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age &&
                score == student2.score &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, score);
    }
}
