/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.main;

import java.sql.SQLException;

/**
 *
 * @author Cliente
 */
public class NewMain {

    public static void main(String[] args) throws SQLException {
        Controlador controlador = new Controlador();

        for (int i = 0; i < 1000; i++) {
            System.out.println("new thread");
            Thread salvar = new Thread(controlador.salvar);
            Thread atualizar = new Thread(controlador.atualizar);
            Thread deletar = new Thread(controlador.deletar);

            salvar.start();
            atualizar.start();
            deletar.start();

        }

    }

}
