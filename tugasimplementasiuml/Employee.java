package tugasimplementasiuml;

public abstract class Employee {
    protected String name;
    protected String afm;

    public Employee(String name, String afm) {
        this.name = name;
        this.afm = afm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }
    
    abstract int payment();
}
