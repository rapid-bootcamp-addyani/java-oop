package PersonData.PersonFile;

import PersonData.PersonData;

public class Organisasi extends PersonData {
    public String Jabatan;
    public Integer memberId;

    public Organisasi(Integer id, String name, String gender, String address, int age, String jabatan, Integer memberId) {
        super(id, name, gender, address, age);
        Jabatan = jabatan;
        this.memberId = memberId;
    }
}
