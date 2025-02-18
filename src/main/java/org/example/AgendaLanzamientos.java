package org.example;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

public class AgendaLanzamientos {
    private ObjectId id;
    private Date fecha;
    private ObjectId lanzaderaId;
    private ObjectId naveId;
    private String estado;
    private List<List<String>> plan_vuelo;
    private ObjectId tripulacion;
}
