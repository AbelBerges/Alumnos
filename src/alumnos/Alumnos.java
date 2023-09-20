/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos;


import AccesoADatos.ABMAlumno;
import Vistas.Acceso;


/**
 *
 * @author kalema
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Acceso.main(args);
        //Connection lacon=Conectar.getConnection();
        ABMAlumno abm=new ABMAlumno();
//        Alumno elAluno=new Alumno(1,2381761, "Moreno", "Mariano", LocalDate.of(2003, 01, 10), true);
//        //abm.insertoDatos(elAluno);
//        abm.modificoAlumno(elAluno);
         
    }
    
}
