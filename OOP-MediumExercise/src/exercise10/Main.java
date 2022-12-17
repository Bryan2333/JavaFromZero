package exercise10;

public class Main {
    public static void main(String[] args) {

        Doctor doctor1 = new Doctor("张三", 35, "牙科医生", '男', 12000);
        Doctor doctor2 = new Doctor("张三", 45, "牙科医生", '男', 12000);
        System.out.println(doctor1.equals(doctor2));
    }
}

class Doctor {
    private String name;
    private int age;
    private char gender;
    private double salary;
    private String job;

    public Doctor(String name, int age, String job,char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.job = job;
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

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Doctor doctor)) {
            return false;
        } else {
            return doctor.name.equals(name) && doctor.age == age && doctor.job.equals(job)
                    && doctor.gender == gender && doctor.salary == salary;
        }
    }
}