import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SinhVien sinhVien = new SinhVien("Minh", 10);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        // list.add(sinhVien);
        // list.add(sinhVien);
        // objectOutputStream.writeObject(list);
        objectOutputStream.writeObject(sinhVien);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("data.in")); 
        list = (ArrayList<SinhVien>) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(list);
    }
}