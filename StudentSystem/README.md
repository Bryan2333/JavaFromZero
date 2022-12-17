# 学生信息管理系统简介

## 主要功能
- 添加学生信息
- 删除学生信息
- 通过学号修改学生信息
- 通过学号或者姓名查询学生信息
- 查看所有学生信息

### 各项功能简介
- 添加学生信息：包含学生姓名、年龄、性别、专业、年级、学号。实现代码如下：
```Java
public void addStudent()
{
    System.out.println("开始添加学生信息");

    System.out.print("请输入学生的姓名: ");
    String name = input.next();

    System.out.print("请输入学生的年龄: ");
    int age = input.nextInt();

    System.out.print("请输入学生的性别: ");
    String sex = input.next();

    System.out.print("请输入学生的专业: ");
    String major = input.next();

    System.out.print("请输入学生的年级: ");
    String grade = input.next();

    System.out.print("请输入学生的学号: ");
    String stu_id = input.next();

    Student addStu = new Student(name, age, sex, major, grade, stu_id);
    stuDao.addStudent(addStu);
    System.out.println("添加学生成功！学生信息如下: "+ '\n' +addStu);
}
```

- 删除学生信息：通过输入的学号查找并删除学生信息。实现代码如下：

```Java
private void deleteStudent()
{
    System.out.print("删除学生信息！");
    System.out.print("请输入要删除信息的学生学号: ");
    String stu_id = input.next();

    if(stuDao.getStudentByStu_id(stu_id).getName() == null)
    {
        System.out.println("该学号没有对应的学生！" + '\n');
    }
    else
    {
        stuDao.delStudentByStu_id(stu_id);
        System.out.println("删除学生信息成功！" + '\n');
    }
}
```

- 通过学号修改学生信息，可实现按需修改。实现代码如下：

```Java
private void updateStudent()
{
    System.out.println("修改学生信息！");
    System.out.print("请输入要修改学生信息的学号: ");
    String stu_id = input.next();

    Student stuToUpdate = stuDao.getStudentByStu_id(stu_id);
    if(stuToUpdate.getStu_id() == null)
    {
        System.out.println("该学号没有对应的学生!" + '\n');
    }
    else
    {
        System.out.println("已找到学号为" + stu_id + "的学生。信息如下: " );
        System.out.println(stuToUpdate);

        //先假定所有信息不变
        String newName = stuToUpdate.getName();
        int newAge = stuToUpdate.getAge();
        String newSex = stuToUpdate.getSex();
        String newMajor = stuToUpdate.getMajor();
        String newGrade = stuToUpdate.getGrade();
        String newStu_id = stu_id;

        boolean toLeave = false;
        while(!toLeave)
        {
            System.out.println("以下为可修改的选项: ");
            System.out.println("1----------------姓名");
            System.out.println("2----------------年龄");
            System.out.println("3----------------性别");
            System.out.println("4----------------专业");
            System.out.println("5----------------年级");
            System.out.println("6----------------学号");
            System.out.println("7----------------保存");
            System.out.print("请输入你的选择: ");

            try
            {
                int choice = input.nextInt();
                switch (choice)
                {
                    case 1 -> {
                        System.out.print("请输入新的姓名: ");
                        newName = input.next();
                        System.out.println("修改成功！" + stuToUpdate.getName() + " -> " + newName + '\n');
                    }
                    case 2 -> {
                        System.out.print("请输入新的年龄: ");
                        newAge = input.nextInt();
                        System.out.println("修改成功！" + stuToUpdate.getAge() + " -> " + newAge + '\n');
                    }
                    case 3 -> {
                        System.out.print("请输入新的性别: ");
                        newSex = input.next();
                        System.out.println("修改成功！" + stuToUpdate.getSex() + " -> " + newSex + '\n');
                    }
                    case 4 -> {
                        System.out.print("请输入新的专业: ");
                        newMajor = input.next();
                        System.out.println("修改成功！" + stuToUpdate.getMajor() + " -> " + newMajor + '\n');
                    }
                    case 5 -> {
                        System.out.print("请输入新的年级: ");
                        newGrade = input.next();
                        System.out.println("修改成功！" + stuToUpdate.getGrade() + " -> " + newGrade + '\n');
                    }
                    case 6 -> {
                        System.out.print("请输入新的学号: ");
                        newStu_id = input.next();
                        System.out.println("修改成功！" + stuToUpdate.getStu_id() + " -> " + newStu_id + '\n');
                    }
                    case 7 -> toLeave = true;
                    default -> System.out.println("无效指令，请输入1-7的整数");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("输入类型错误，请重新输入!" + '\n');
                input.nextLine();
            }
        }
        Student newStudent = new Student(newName, newAge, newSex, newMajor, newGrade, newStu_id);
        stuDao.updateStudent(stu_id, newStudent);
        System.out.println("修改学生信息成功！修改后学生信息如下: "+ '\n' + newStudent);
    }
}
```

- 通过学号或者姓名查询学生信息，实现代码如下：

```Java
private void searchStudent()
{
	System.out.print("查找学生");
	System.out.print("请输入查询模式: 1、学号查询 2、姓名查询: ");

	int choice = input.nextInt();
	if(choice == 1)
	{
		System.out.print("请输入要查询的学号: ");
		String stu_id = input.next();
		Student stuToSearch = stuDao.getStudentByStu_id(stu_id);
		if(stuToSearch.getStu_id() == null)
		{
            System.out.println("该学号没有对应的学生!" + '\n');
        }
        else
        {
            System.out.println("已找到学号为" + stu_id + "的学生。信息如下: " );
            System.out.println(stuToSearch);
        }
    }
    else if(choice == 2)
    {
        System.out.print("请输入要查询的姓名: ");
        String name = input.next();

        List<Student> list = stuDao.getStudentByName(name);
        if(list.size() <= 0)
        {
            System.out.println("没有该姓名的学生!" + '\n');
        }
        else
        {
            System.out.println("已找到" + list.size() + "位名为" + name + "的学生。信息如下: ");
            for (Student student : list)
	    {
		System.out.println(student);
            }
	}
    }
}
```

- 查看所有学生信息。实现代码如下：
```Java
private void listAllStudent()
{
	List<Student> list = new ArrayList<>(stuDao.getAllStudent());
	System.out.println("已找到" + list.size() + "位学生。信息如下: " );
	for(Student student : list)
	{
		System.out.println(student);
	}
}
```
