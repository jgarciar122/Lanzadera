package org.example.model;

import org.bson.types.ObjectId;

public class Carga {
    private ObjectId id;
    private String nombre;
    private CantidadPorTipo cantidadPorTipo;
    private double pesoPorUnidad;

    public Carga(String nombre, CantidadPorTipo cantidadPorTipo, double pesoPorUnidad) {
        this.nombre = nombre;
        this.cantidadPorTipo = cantidadPorTipo;
        this.pesoPorUnidad = pesoPorUnidad;
    }


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public CantidadPorTipo getCantidadPorTipo() {
        return cantidadPorTipo;
    }

    public void setCantidadPorTipo(CantidadPorTipo cantidadPorTipo) {
        this.cantidadPorTipo = cantidadPorTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoPorUnidad() {
        return pesoPorUnidad;
    }

    public void setPesoPorUnidad(double pesoPorUnidad) {
        this.pesoPorUnidad = pesoPorUnidad;
    }

    public static class CantidadPorTipo{
        private int exploracion;
        private int transbordador;
        private int investigacion;

        public int getExploracion() {
            return exploracion;
        }

        public void setExploracion(int exploracion) {
            this.exploracion = exploracion;
        }

        public int getTransbordador() {
            return transbordador;
        }

        public void setTransbordador(int transbordador) {
            this.transbordador = transbordador;
        }

        public int getInvestigacion() {
            return investigacion;
        }

        public void setInvestigacion(int investigacion) {
            this.investigacion = investigacion;
        }
    }
}
