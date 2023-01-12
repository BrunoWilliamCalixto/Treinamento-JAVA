package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String converterDateParaDataeHora(Date data){ //Método pode ser usado mesmo se eu nao instanciar a classe
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(data);
    }
}


