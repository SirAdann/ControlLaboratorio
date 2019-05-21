package prubalaboratorio.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="estado_prestamos")
public class EstadoPrestamos {
    @Id
    @GeneratedValue
    @Column(name="id_estado")
    int idEstado;
    @Column(name="estado")
    String estado;

    public EstadoPrestamos(){

    }



}
