package model;

public class Department {
    private int depId;
    private String depName;
    private String depCode;

    public Department(int depId, String depName, String depCode) {
        this.depId = depId;
        this.depName = depName;
        this.depCode = depCode;
    }

    public int getDepId() { return depId; }
    public String getDepartmentName() { return depName; }
    public String getDepartmentCode() { return depCode; }
}
