package edu.elp.siselp.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Administrativo extends Persona{
    @Column(name = "area_labor",length = 50,nullable = false)
    private  String areaLabor;

    @Column(name = "cod_admi",length = 12,nullable = false)
    private  String codAdmi;

    public Administrativo() {

    }

    public String getAreaLabor() {
        return areaLabor;
    }

    public void setAreaLabor(String areaLabor) {
        this.areaLabor = areaLabor;
    }

    public String getCodAdmi() {
        return codAdmi;
    }

    public void setCodAdmi(String codAdmi) {
        this.codAdmi = codAdmi;
    }
}
