public class GenericType <T, G, S>{

    T age;
    T id;
    G name;
    S salary;

    public GenericType(T age, T id, G name, S salary){
        this.age = age;
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Age :" + age +" id :"+ id + " name :" + name + " salary :" + salary);
    }

    public static void main (String[] args){
        GenericType <Integer, String, Float> genericType = new GenericType<Integer,String, Float>(35, 51324663, "Dinesh", 80000.00f);
        genericType.display();
    }

}
