import java.util.ArrayList;
import java.util.Iterator;

public class CEO implements Component{
    private String name;
    private ArrayList<Component> departments;

    public CEO(String name, ArrayList<Component> departments) {
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
        Component component;
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
        System.out.println("HOla soy el CEO y estoy cobrando por usar unity");
    }
}
