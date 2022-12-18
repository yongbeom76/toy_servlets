package kr.co.kybex.toy_servlets.beans;

public class UserInfo {
    private String name;
    private String department;

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }
}
