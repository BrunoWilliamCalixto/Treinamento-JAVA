import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Instância uma data do agora
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        //Instancia uma data e hora de agora
        LocalDateTime dT02 = LocalDateTime.now();
        System.out.println(dT02);

        //Criando um local Instant, marco zero de Londres
        Instant d03 = Instant.now();
        System.out.println(d03);

        //Texto e geração de data
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);

        //Texto e geração de data-hora
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T20:36:24");
        System.out.println(d05);

        //Texto e geração de data-hora de Londres
        Instant d06 = Instant.parse("2022-07-20T20:36:24Z");
        System.out.println(d06);

         //Texto e geração de data-hora de Londres com 3 horas a mais comparado com Brasil
        Instant d07 = Instant.parse("2022-07-20T20:36:24-03:00");
        System.out.println(d07);

        //Texto no formado customizado
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        System.out.println(d08);

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println(d09);

        //Intanciar dia, mes e ano isoladamente
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println(d10);

        //Intanciar dia, mes e ano isoladamente
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
        System.out.println(d11);

    }
}
