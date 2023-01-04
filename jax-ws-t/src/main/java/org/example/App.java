package org.example;


import jakarta.xml.ws.Service;
import org.example.service.AtendeCliente;
import org.example.service.EnderecoERP;

import javax.xml.namespace.QName;
import java.net.URL;

public class App
{
    public static void main( String[] args ) throws Exception
    {
        URL urlCorreios = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
        //targetNameSpace , nome do serviço
        QName qName = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");

        Service serviceCorreios = Service.create(urlCorreios, qName);

        //proxy para usar os serviços
        AtendeCliente correios = serviceCorreios.getPort(AtendeCliente.class); //o método getPort cria um proxy para consumir os serviços que estão descritos wsdl

        EnderecoERP endereco = correios.consultaCEP("58113616");
        System.out.println(endereco.getCidade());
        System.out.println(endereco.getBairro());
        System.out.println(endereco.getEnd());
        System.out.println(endereco.getUf());
    }
}
