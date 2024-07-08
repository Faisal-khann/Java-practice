class Student{
    private String name;
    private int rollno;
 //Use getter and setter functon
public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setRollno(int rollno){
    this.rollno = rollno;
}
public int getRollno(){
    return rollno;
}

}
public class getterSetter_1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Charlie");
        st.setRollno(10);
        System.out.println("Name of the student is: "+ st.getName());
        System.out.println("Roll no of student is: "+ st.getRollno());
        
    }
}
