class A {  
    void fn_a() {
        System.out.println("This is CLASS A");
    }  
}  

class B extends A {  
    void fn_b() { 
        System.out.println("This is CLASS B extended from Class A");
    }  
}  

class C extends B {  
    void fn_c() {
        System.out.println("This is CLASS C extended from CLASS B");
    }  
}  

class multilevel_inheritance{  
    public static void main(String args[]) {  
        C d=new C();
        d.fn_c();  
        d.fn_b();  
        d.fn_a();  
    }
}  