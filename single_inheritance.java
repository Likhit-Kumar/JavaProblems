class Student{  
    void read() {
        System.out.println("Reading the book");
    }  
}  

class assign extends Student {  
    void write() {
        System.out.println("Writing the assignment !");
    }  
}
class single_inheritance{  
    public static void main(String args[]){  
    assign a=new assign();  
    a.read();  
    a.write();  
    }
}