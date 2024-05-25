public class SecondaryDepartment implements Component{
    private String name;

    public SecondaryDepartment(String nombre) {
        name = nombre;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        name = name;
    }
    @Override
    public void working(){ System.out.println("Soy departamento secundario: "+getname()+" y estoy trabajando");};
}
