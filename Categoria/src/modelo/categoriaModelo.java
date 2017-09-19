
package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author David
 */
@Entity

public class categoriaModelo {
  @Id  
 @Column(name = "ID_CATEGORIA")
  @GeneratedValue
  private   int id;
  
  @Column(name = "NM_CATEGORIA")
  private  String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
            
    
    
}
