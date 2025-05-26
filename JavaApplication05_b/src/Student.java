
public class Student {

    private String code;
    private String name;
    private int bYear;
    private String address;

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.bYear = bYear;
        this.address = address;
    }

    public Student() {
        this.code = "";
        this.name = "";
        this.bYear = 0;
        this.address = "";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null && !code.isEmpty()) {
            this.code = code;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        if (bYear >= 1900) {
            this.bYear = bYear;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        }
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", bYear=" + bYear + ", address=" + address + '}';
    }

    // input
    // output
    
}
