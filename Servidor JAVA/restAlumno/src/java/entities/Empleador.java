/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rober
 */
@Entity
@Table(name = "empleador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleador.findAll", query = "SELECT e FROM Empleador e")
    , @NamedQuery(name = "Empleador.findByIdEmpleador", query = "SELECT e FROM Empleador e WHERE e.idEmpleador = :idEmpleador")
    , @NamedQuery(name = "Empleador.findByNombre", query = "SELECT e FROM Empleador e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empleador.findByApPaterno", query = "SELECT e FROM Empleador e WHERE e.apPaterno = :apPaterno")
    , @NamedQuery(name = "Empleador.findByApMaterno", query = "SELECT e FROM Empleador e WHERE e.apMaterno = :apMaterno")
    , @NamedQuery(name = "Empleador.findByNumero", query = "SELECT e FROM Empleador e WHERE e.numero = :numero")
    , @NamedQuery(name = "Empleador.findByEmail", query = "SELECT e FROM Empleador e WHERE e.email = :email")})
public class Empleador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleador")
    private Integer idEmpleador;
    @Size(max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 40)
    @Column(name = "apPaterno")
    private String apPaterno;
    @Size(max = 40)
    @Column(name = "apMaterno")
    private String apMaterno;
    @Size(max = 10)
    @Column(name = "numero")
    private String numero;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 70)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne
    private Empresa idEmpresa;

    public Empleador() {
    }

    public Empleador(Integer idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public Integer getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(Integer idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpleador != null ? idEmpleador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleador)) {
            return false;
        }
        Empleador other = (Empleador) object;
        if ((this.idEmpleador == null && other.idEmpleador != null) || (this.idEmpleador != null && !this.idEmpleador.equals(other.idEmpleador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Empleador[ idEmpleador=" + idEmpleador + " ]";
    }
    
}
