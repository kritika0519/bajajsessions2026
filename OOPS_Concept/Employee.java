class data {
    private String eid;
    private String ename;
    private int eage;
    private String eaddress;

    // setter method
    public void setEid(String eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    // getter method
    public String getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public int getEage() {
        return eage;
    }

    public String getEaddress() {
        return eaddress;
    }
}

public class Employee {
    public static void main(String[] args) {
        data e1 = new data();
        // setting data
        e1.setEid("101");
        e1.setEname("kartikeya");
        e1.setEage(19);
        e1.setEaddress("Ambala");

        // getting value
        System.out.println("Employee ID: " + e1.getEid());
        System.out.println("Employee name:- " + e1.getEname());
        System.out.println("Employee age: " + e1.getEage());
        System.out.println("Employee address: " + e1.getEaddress());
    }
}
