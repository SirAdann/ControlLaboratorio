package prubalaboratorio.demo.Entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name="laboratorios")
public class Laboratorio {

    @Id
    @Column(name="laboratorio")
    private String laboratorio;
    @Column(name="capacidad")
    private int capacidad;
    @Column(name="equipos")
    private int equipos;

    public Laboratorio() {
    }
}