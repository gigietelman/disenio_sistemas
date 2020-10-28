package Adapter;
 
public class AdapterDemo {

    public static void main(String[] args){
        Espanol espanol = new Espanol();
        System.out.println(espanol.interpretarTexto("Hello"));
        espanol = new InterpreteInglesAdapter();
        System.out.println(espanol.interpretarTexto("Hello"));
    }
}
