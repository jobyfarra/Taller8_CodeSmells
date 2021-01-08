/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author USUARIO
 */
public class CalculadoraDeNotas {

    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Estudiante e, Paralelo p, double nexamen, double ndeberes, double nlecciones, double ntalleres) {

        double notaInicial = 0;
        for (Paralelo par : e.paralelos) {
            if (p.equals(par)) {
                double notaTeorico = (e.nexamen + ndeberes + nlecciones) * 0.80;
                double notaPractico = (ntalleres) * 0.20;
                notaInicial = notaTeorico + notaPractico;
            }
        }
        return notaInicial;
    }

    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaFinal(Estudiante e, Paralelo p, double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        double notaFinal = 0;
        for (Paralelo par : e.paralelos) {
            if (p.equals(par)) {
                double notaTeorico = (nexamen + ndeberes + nlecciones) * 0.80;
                double notaPractico = (ntalleres) * 0.20;
                notaFinal = notaTeorico + notaPractico;
            }
        }
        return notaFinal;
    }

    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Estudiante e, Paralelo p) {
        double notaTotal = 0;
        for (Paralelo par : e.paralelos) {
            if (p.equals(par)) {
                notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;

            }
        }
        return notaTotal;

    }
}
