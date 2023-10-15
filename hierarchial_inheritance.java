class Classroom {  
    void class_room() {
        System.out.println("Assignment");
    }  
}  

class Student1 extends Classroom {  
    void fn_std1() {
        System.out.println("Student1 Reading");
    }  
}  
    
class Student2 extends Classroom{  
    void fn_std2() {
        System.out.println("Student2 Writing");
    }  
}  

class hierarchial_inheritance{  
    public static void main(String args[]) {  
        Student2 s2 = new Student2();
        s2.fn_std2();
        // s.fn_std1();

        Student1 s1 = new Student1();
        s1.fn_std1();
    }
}  