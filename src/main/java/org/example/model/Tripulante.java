package org.example.model;

import org.bson.types.ObjectId;

public class Tripulante {
    private ObjectId id;
    private String nombre;
    private double peso;
    private boolean disponible;
    //@BsonProperty(value = lanzadera_id)
    private ObjectId lanzaderaId;

}
