import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {

        //Convertendo data-hora global para loca
        
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        //Cálculos com data-hora

        LocalDate pastWeek = d04.minusDays(7); // Instância uma nova data -7 dias como exemplo
        System.out.println("dias passados = " + pastWeek);

        LocalDate nextWeek = d04.plusDays(7);// Instância uma nova data -7 dias como exemplo
        System.out.println("Próximos dias = " + nextWeek);

        LocalDateTime nextWeekTime = d05.plusDays(7);// Instância uma nova data -7 dias como exemplo
        System.out.println("Próxima data com horas = " + nextWeekTime);

        LocalDateTime pastWeekTime = d05.minusDays(7);// Instância uma nova data -7 dias como exemplo
        System.out.println("Próxima data com horas = " + nextWeekTime);

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);// Instância uma nova data -7 dias como exemplo
        System.out.println("Próxima data com horas Instant = " + nextWeekInstant);

       // Duração de data-hora

       Duration t1 = Duration.between(pastWeekTime, d05);
       System.out.println(t1.toDays());

       Duration t2 = Duration.between(pastWeek.atStartOfDay(), d05);
       System.out.println(t2.toDays());

       Duration t3 = Duration.between(pastWeek.atStartOfDay(), d05);
       System.out.println(t3.toDays());
    }
}
