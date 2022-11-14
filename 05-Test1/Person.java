public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public void setName(String newName){this.name = newName;}

    public int getAge(){return age;}
    public void setAge(int newAge){this.age = newAge;}

    public boolean isAdult(){
        if(getAge()>=18){
            return true; } else {
                return false;
            }
    }

    public String toString(){
        String details = "";
        details += name+","+age;
        return details;
    }

    
    
    // public static void main(String[] args){
    //     Person p = new Person("Anna",21);
    //     System.out.println(p.getAge());
    //     System.out.println(p.getName());
    //     System.out.println(p.isAdult());
    //     System.out.println(p.toString());
    // }

}
