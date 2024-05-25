import java.util.ArrayList;
import java.util.Iterator;

public class PrincipalDEpartment implements Component{
    private String name;
    private ArrayList<Component> departments;

    public PrincipalDEpartment(String name, ArrayList<Component> departments) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addChildren(Component component){
        departments.add(component);

    }
    public void removeChildren(Component component){
        departments.remove(component);
    }

    public void getChildren(){
        Iterator<Component> iter = departments.iterator();
        while(iter.hasNext()){
            iter.next();

        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Component> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Component> departments) {
        this.departments = departments;
    }

    @Override
    public void working() {
        System.out.println("SOy un departamento principal y estoy trabajando");
    }
}
