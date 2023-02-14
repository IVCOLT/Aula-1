public class App {
    public static void main(String[] args) {

        //iphone 12, 6.1", 256gb, IOS
        //Galaxy Note 20 Ultra, tela 6.9", 256gb, Android
        //Xiaomi Mi 11 Pro, tela 6.81", 128gb, Android

        Celular celularA = new Celular();
        celularA.nome = "iPhone 12";
        celularA.sistemaOperacional = "IOS";
        celularA.armazenamento = 256;
        celularA.tela = 6.1f;

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.sistemaOperacional = "Android";
        celularB.armazenamento = 256;
        celularB.tela = 6.9f;

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Mi 11 Pro";
        celularC.sistemaOperacional = "Android";
        celularC.armazenamento = 128;
        celularC.tela = 6.81f;

        System.out.format("Celular %s com tela de %.1f, com %d e SO %s \n" , celularA.nome, celularA.tela, celularA.armazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %d e SO %s \n" , celularB.nome, celularB.tela, celularB.armazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s com tela de %.1f, com %d e SO %s \n" , celularC.nome, celularC.tela, celularC.armazenamento, celularC.sistemaOperacional);



    }
}
