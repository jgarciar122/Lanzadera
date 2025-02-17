package org.example;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Date;

public class AgendaLanzamientos {
    private ObjectId id;
    private Date fecha;
    @BsonProperty(value = lanzadera_id)
    private ObjectId lanzaderaId;
    @BsonProperty(value = nave_id)
    private ObjectId naveId;
    private String estado;
    private String[][] plan_vuelo;
    private ObjectId tripulacion;
}
