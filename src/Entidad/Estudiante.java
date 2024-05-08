/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author HP
 */
public class Estudiante {

    String DNI, nombre, sexo, apoderado, grado, telefono, fechaNac;
    int edad;

    public Estudiante(String DNI, String nombre, String sexo, String apoderado, String grado, String telefono, String fechaNac) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.sexo = sexo;
        this.apoderado = apoderado;
        this.grado = grado;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.edad = calcularEdad();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApoderado() {
        return apoderado;
    }

    public void setApoderado(String apoderado) {
        this.apoderado = apoderado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int calcularEdad() {
        // Formatear la fecha de nacimiento al formato adecuado (por ejemplo, "dd/MM/yyyy")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(this.fechaNac, formatter);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la diferencia entre la fecha actual y la fecha de nacimiento
        Period periodo = Period.between(fechaNac, fechaActual);

        // Obtener la edad
        return periodo.getYears();
    }

}
