package org.example.model;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Nave {
    private ObjectId id;
    private String nombre;
    private ObjectId lanzaderaId;
    private TipoNave tipo;
    private int combustible;
    private int oxigeno;
    private Integer diasDuracionInvestigacion;

    public Nave(){}

    public Nave(String nombre, ObjectId lanzaderaId, TipoNave tipo, int combustible, int oxigeno, Integer diasDuracionInvestigacion) {
        this.nombre = nombre;
        this.lanzaderaId = lanzaderaId;
        this.tipo = tipo;
        this.combustible = combustible;
        this.oxigeno = oxigeno;
        this.diasDuracionInvestigacion = diasDuracionInvestigacion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ObjectId getLanzaderaId() {
        return lanzaderaId;
    }

    public void setLanzaderaId(ObjectId lanzaderaId) {
        this.lanzaderaId = lanzaderaId;
    }

    public TipoNave getTipo() {
        return tipo;
    }

    public void setTipo(TipoNave tipo) {
        this.tipo = tipo;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public Integer getDiasDuracionInvestigacion() {
        return diasDuracionInvestigacion;
    }

    public void setDiasDuracionInvestigacion(Integer diasDuracionInvestigacion) {
        this.diasDuracionInvestigacion = diasDuracionInvestigacion;
    }
}
