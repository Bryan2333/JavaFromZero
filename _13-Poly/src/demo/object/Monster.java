package demo.object;

public class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        setName(name);
        setJob(job);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Monster Info { "
                + "name: " + name + ","
                + " job: " + job + ","
                + " salary: " + salary
                + " }";
    }
}
