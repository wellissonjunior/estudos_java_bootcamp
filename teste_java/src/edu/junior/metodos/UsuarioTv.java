package edu.junior.metodos;

public class UsuarioTv {
    public static void main(String[] args) throws Exception {

        SistemaDeTv sistemaDeTv = new SistemaDeTv();
        System.out.println(sistemaDeTv.ligada);
        System.out.println(sistemaDeTv.canal);
        System.out.println(sistemaDeTv.volume);

        sistemaDeTv.ligar();
        System.out.println("Novo status" + sistemaDeTv.ligada);

        sistemaDeTv.aumentarVolume();
        sistemaDeTv.aumentarVolume();
        sistemaDeTv.aumentarVolume();
        sistemaDeTv.aumentarVolume();
        
        
        sistemaDeTv.diminuirVolume();
        
        sistemaDeTv.aumentarCanal();
        sistemaDeTv.aumentarCanal();
        sistemaDeTv.aumentarCanal();

        sistemaDeTv.diminuirCanal();
        sistemaDeTv.diminuirCanal();

        sistemaDeTv.mudarCanal(13);
        sistemaDeTv.mudarCanal(40);



    }
}
