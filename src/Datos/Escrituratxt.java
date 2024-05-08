package Datos;

import Entidad.Estudiante;
import Entidad.RegistroNota;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author HP
 */
public class Escrituratxt {

    public void registrarEstudiante(Estudiante estudiante) {
        String rutaArchivo = "estudiante.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir los datos en el archivo separados por comas
            writer.write(estudiante.getDNI() + ","
                    + estudiante.getNombre() + ","
                    + estudiante.getSexo() + ","
                    + estudiante.getApoderado() + ","
                    + estudiante.getGrado() + ","
                    + estudiante.getTelefono() + ","
                    + estudiante.getFechaNac() + ","
                    + estudiante.getEdad() + "\n");

            System.out.println("Registro guardado exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }

    public void actualizarEstudiante(List<Estudiante> listaEstudiantes) {
        String rutaArchivo = "estudiante.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Estudiante estudiante : listaEstudiantes) {
                // Escribir los datos de cada estudiante en una nueva línea en el archivo
                writer.write(estudiante.getDNI() + ","
                        + estudiante.getNombre() + ","
                        + estudiante.getSexo() + ","
                        + estudiante.getApoderado() + ","
                        + estudiante.getGrado() + ","
                        + estudiante.getTelefono() + ","
                        + estudiante.getFechaNac() + ","
                        + estudiante.getEdad() + "\n");
            }
            System.out.println("Archivo estudiante.txt actualizado exitosamente.");
            //JOptionPane.showMessageDialog(null, "Archivo estudiante.txt actualizado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al intentar actualizar el archivo estudiante.txt");
            // Mostrar el mensaje de error
            //JOptionPane.showMessageDialog(null, "Error al intentar actualizar el archivo estudiante.txt", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarNota(RegistroNota nota) {
        String rutaArchivo = "notas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            
            // Escribir los datos en el archivo separados por comas
            writer.write(nota.getDNI() + ","
                    + nota.getCurso() + ","
                    + nota.getN1() + ","
                    + nota.getN2() + ","
                    + nota.getPy() + ","
                    + nota.getEf() + "\n");

            System.out.println("Nota registrada exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al intentar escribir en el archivo " + rutaArchivo);
        }
    }
    
    
    
    public void actualizarNotas(List<RegistroNota> listaNotas) {
        String rutaArchivo = "notas.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (RegistroNota nota : listaNotas) {
                // Escribir los datos de cada nota en una nueva línea en el archivo
                writer.write(nota.getDNI() + ","
                        + nota.getCurso() + ","
                        + nota.getN1() + ","
                        + nota.getN2() + ","
                        + nota.getPy() + ","
                        + nota.getEf() + "\n");
            }
            System.out.println("Archivo notas.txt actualizado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al intentar actualizar el archivo notas.txt");
        }
    }
}
