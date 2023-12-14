import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class diasVividos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu dia de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.println("Cual es tu mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.println("Cual es tu año de nacimiento: ");
        int anio = scanner.nextInt();


        LocalDate nacimiento= LocalDate.of(anio,mes,dia);
        LocalDate hoy=LocalDate.now();

        System.out.println("Tu fecha de nacimiento: "+nacimiento);
        System.out.println("La fecha de Hoy: "+hoy);

        System.out.println("Haz vivido " + ChronoUnit.DAYS.between(nacimiento,LocalDate.now()) + " dias");
    }
}
