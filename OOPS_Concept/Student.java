class Data {
   // data security
   private int rollNo;
   private String name;
   private String address;

   // setter method
   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   // getter method
   public int getRollNo() {
      return rollNo;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }
   
}

public class Student {
   public static void main(String[] args) {
      Data s1 = new Data();
      // calling setter methods
      s1.setRollNo(12);
      s1.setName("kartikeya");
      s1.setAddress("AMBALA");
      // calling getter methoods
      System.out.println("roll number is: " + s1.getRollNo());
      System.out.println("name is: " + s1.getName());
      System.out.println("student address is: " + s1.getAddress());

   }
}
