import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //Enquanto o escopo local for guardado dentro de uma variável, podemos reaproveitar o mesmo
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //Formatação de data que pega o fuso horário padrão do sistema operacional do usuário
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println(d01.format(fmt1));

        //Instância de localidade onde se é executado e depois deletado
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d02.format(fmt2));
        System.out.println(fmt3.format(d03));
    }
}
