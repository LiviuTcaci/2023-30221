package demo;

public class BankStaff {
    private int staffID;
    private String name;
    private String position;

    //Cosntructor
    public BankStaff(int staffID, String name, String position){
        this.staffID = staffID;
        this.name = name;
        this.position = position;
    }

    //Getters and setters
    public int getStaffID() {
        return staffID;
    }
    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    //Methods
    public String toString(){
        String result = "Staff: " + "staffId= " + staffID + ", name= " + name + ", position= " + position + ".";
        return result;
    }

}
