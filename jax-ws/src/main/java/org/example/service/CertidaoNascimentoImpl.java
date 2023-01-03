package org.example.service;

import jakarta.jws.WebService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Service Implementation Bean - SIB
//Linkando com a interface de serciços
@WebService(endpointInterface = "org.example.service.CertidaoNascimento")
public class CertidaoNascimentoImpl implements CertidaoNascimento {

    @Override
    public int calcularIdade(String idade) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int idadeCalculada = 0;
        try {
            Calendar dataNascimento = Calendar.getInstance();
            Date idadeDate = sdf.parse(idade);
            dataNascimento.setTime(idadeDate);

            Calendar hoje = Calendar.getInstance();
            idadeCalculada = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
            //se ainda não chegou o aniversário
            if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
                idadeCalculada--;
            } else {
                if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
                        && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                    idadeCalculada--;
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return idadeCalculada;
    }

    @Override
    public String diaSemanaNascimento(String idade) {
        String dias[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        int dia = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Calendar dataNascimento = Calendar.getInstance();
            Date idadeDate = sdf.parse(idade);
            dataNascimento.setTime(idadeDate);
            dia = dataNascimento.get(Calendar.DAY_OF_WEEK);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dias[dia - 1];
    }
}
