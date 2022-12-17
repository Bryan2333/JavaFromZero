package exercise02;

public class Test {
    public static void main(String[] args) {
        Professor professor1 = new Professor("张三", 37, "教授", 20000);
        professor1.introduce();

        AssistantProfessor aP1 = new AssistantProfessor("李四", 27, "副教授", 8000);
        aP1.introduce();

        Instructor instructor1 = new Instructor("王五", 26, "讲师", 5000);
        instructor1.introduce();
    }
}
