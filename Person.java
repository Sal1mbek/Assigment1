public class Person {
    private String fullName;
    private int age;
    public void move(){
        System.out.println("Such and such a Person is talking" );
    }
    public void talk(){
        System.out.println("Such and such a Person is talking" );
    }
    public Person(){

    }
    public Person(String fullName, int age){
        this.fullName=fullName;
        this.age=age;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getFullname(){
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
