import javax.swing.plaf.ActionMapUIResource;

public class Main {
    public static void main(String[] args) {
        person p=new person();
        p.setName("tt");
        System.out.println(p.getName());
    }
}
 class person{
    private String name;
    private int age;
 public void setName(String name){
     this.name=name;
 }
 public String getName(){
     return name;
 }

 }


