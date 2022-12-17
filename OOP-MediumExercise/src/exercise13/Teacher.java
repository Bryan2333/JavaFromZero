package exercise13;

public class Teacher extends Person{
    private int workAge;

    public Teacher(String name, char sex, int age, int workAge) {
        super(name, sex, age);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public void teach() {
        System.out.println("我承诺，我会好好教学!");
    }

    public String play() {
        return super.play() + "象棋";
    }

    public String toString() {
        return "老师的信息:" + '\n'
                + super.toString()
                + "工龄: " + workAge + '\n'
                + play();
    }

    public void printInfo() {
        System.out.println(this);
        teach();
    }
}
