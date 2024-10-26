import java.io.Serializable;

public class SinhVien implements Serializable{
    private String name;
    private int tuoi;

    SinhVien(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return this.name;
    }

    public int getTuoi() {
        return this.tuoi;
    }
    public String toString(){
        return this.name + " " + this.tuoi;
    }
}
