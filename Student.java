package Jan7;

public class Student {
    int regdNo;
    String name;
    public Student(int regdNo, String name){
        this.regdNo = regdNo;
        this.name = name;
    }
    public void SetName (String name){
        this.name = name;
    }
    public void setregdNo (int regdNo){
        this.regdNo = regdNo;
    }
    public int getregdNo(){
        return regdNo;
    }
    public String getname(){
        return name;
    }
    //override equals
    public boolean equals(Object o){
        if(o instanceof Student){
        Student s = (Student) o;
        if(s.getregdNo() == this.regdNo && s.getname() == this.name){
            return true;
        } else {
            return false;
        } }
        else {
        return false;}
    }
    public int hashCode(){
        return (int)name.charAt(0) + (regdNo %10);
    }
    public String toString(){
        return this.getname() +" "+ this.getregdNo();
    }

    }
