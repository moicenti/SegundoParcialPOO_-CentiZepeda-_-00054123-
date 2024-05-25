public class SecondaryDepartment implements Component{
    private String name;

    public SecondaryDepartment(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    @Override
    public void working(){ System.out.println("Soy departamento secundario: "+getname()+" y estoy trabajando");};
}
