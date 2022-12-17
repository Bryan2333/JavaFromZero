public class Demo01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(200);
        p1.setJob("Java工程师");
        p1.setSalary(6000);

        System.out.println(p1);
    }
}

class Person {

    private String name; //名字公开
    private int age; //年龄私有
    private double salary;
    private String job;

    public void setAge(int age) {
        if (1 <= age && age <= 120) {
            this.age = age;
        } else {
            System.out.println("请输入合理范围的年龄(1~120)!");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && 2 <= name.length() && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("您输入的名字过长！名字长度为2~6个字符");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString() {
        return "信息为name = " + name + ", age = " + age + ", job = " + job + ", salary = " + salary;
    }
}
