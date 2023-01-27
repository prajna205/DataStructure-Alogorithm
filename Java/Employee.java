package Java;

public class Employee {
    private String name;
    private int id;
    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
       if(obj == null || getClass() != obj.getClass()){
        return false;
       } 
       else if(this == obj){
        return true;
       }
       Employee e = (Employee)obj;
       //return (e.getId() == this.getId() && e.getName() == this.getName());
       return (e.getId() == this.getId());
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
