package com.inputstream;

import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.outputstream.Employee;

public class ObjectInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void input() throws IOException, ClassNotFoundException {
        String filePath = ".\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        // 按输出的顺序读取
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Employee emp = (Employee) ois.readObject();
        System.out.println(emp);

        ois.close();
    }
}
