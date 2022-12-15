package PersonData.PersonFile;

import PersonData.PersonData;

public class Ecommerce extends PersonData {
    public String statusMember;
    public Integer memberId;

    public Ecommerce(Integer id, String name, String gender, String address, int age, String statusMember, Integer memberId) {
        super(id, name, gender, address, age);
        this.statusMember = statusMember;
        this.memberId = memberId;
    }
}
