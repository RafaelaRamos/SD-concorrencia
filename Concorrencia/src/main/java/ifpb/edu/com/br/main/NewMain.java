/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.com.br.main;

import java.sql.SQLException;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Cliente
 */
public class NewMain {
    private static Semaphore sem = new Semaphore(1);

    public static void main(String[] args) throws SQLException {
        Controlador controlador = new Controlador();

        for (int i = 0; i < 101; i++) {
            System.out.println(i);
            Thread salvar = new Thread(controlador.salvar);
            Thread atualizar = new Thread(controlador.atualizar);
            Thread deletar = new Thread(controlador.deletar);
            
            try {
                sem.acquire();
                salvar.start();
                sem.release();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            atualizar.start();
            deletar.start();

        }

    }

}
