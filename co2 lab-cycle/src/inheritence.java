class a{
    void show(){
        System.out.println("123456");
    }
}
class b extends a{

}
class c extends b{

}

public class inheritence {
    public static void main(String[] args){
        c c1 = new c();
        c1.show();
    }
}
