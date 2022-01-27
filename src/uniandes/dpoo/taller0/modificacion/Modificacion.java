package uniandes.dpoo.taller0.modificacion;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.IOException;

public class Modificacion {
  public static void main(String[] args) throws IOException {
    CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
    System.out.println(calc.paisConMasMedallistas());
  }
}
