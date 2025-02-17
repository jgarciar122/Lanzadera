package org.example.model;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Nave {
    private ObjectId id;
    private String nombre;
    @BsonProperty(value = lanzadera_id)
    private ObjectId lanzaderaId;
    private String tipo;
}
