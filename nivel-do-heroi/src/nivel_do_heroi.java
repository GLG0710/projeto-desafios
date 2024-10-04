import java.util.Scanner;

public class nivel_do_heroi {
    public static void main(String[] args) {
        //INPUT
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
            String nome = scanner.next();
        System.out.println("Digite a sua XP: ");
            int xp = scanner.nextInt();   
        
        //PROCESSAMENTO
        String nivel;
        if (xp <= 1000) {
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        scanner.close();

        //OUTPUT
        System.out.println("O Herói de nome "+nome+" está no nível de "+nivel);
    }
}
