package Hora;

import java.text.SimpleDateFormat;
import java.util.Date;



public class Hora {
    public static String hora() {
        Date dataHoraAtual = new Date();
        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
        String minutos = new SimpleDateFormat("mm").format(dataHoraAtual);

        int vInteiroHora = Integer.parseInt(hora);

        if (vInteiroHora > 0 && vInteiroHora <= 12) {
            return vInteiroHora + ":" + minutos + " Bom dia!";

        } else if (vInteiroHora <= 17 ) {

            return vInteiroHora + ":" + minutos + " Boa tarde!";

        } else {
            return vInteiroHora + ":" + minutos + " Boa noite!";
        }

    }}