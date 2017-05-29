//Alejandro Suárez Perales
package com.practicas.ede;

// Linea.java
public class Linea {
  // Constructor de una línea
  public Linea(double x0, double y0, double x1, double y1) {
    this.x0 = x0;
    this.y0 = y0;
    this.x1 = x1;
    this.y1 = y1;
  }

  // Calcular la pendiente de inclinación
  public double getPendiente( ) {
    // No permitir dividir por cero
    if(x1 == x0) {
      throw new ArithmeticException( );
    }

    return (y1 - y0) / (x1 - x0);
  }

  // calcular la distancia de la linea
  public double getDistancia( ) {
    return Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
  }

  // devuelve si una línea es paralela a otra
  public boolean esParalelaAOtra(Linea l) {
    // si la diferencia entre las pendientes es muy pequeña, la consideraremos paralela
    if(Math.abs(getPendiente( ) - l.getPendiente( )) < .0001) {
      return true;
    } else {
      return false;
    }
  }

  // atributos privados de instancia
  private double x0, y0, x1, y1;
}
