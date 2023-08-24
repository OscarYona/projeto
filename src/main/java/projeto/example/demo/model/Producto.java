package projeto.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity 
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/DD  HH:mm:ss")
	private LocalDateTime created_at;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/DD  HH:mm:ss")
	private LocalDateTime updated_at;
	
	@NotBlank
	private Double preciocosto;
	
	@NotBlank
	private Boolean PcArmada;
	
	@ManyToOne
	@JoinColumn(name= "marca_id", nullable= false)
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name= "pc_armada_id", nullable= true)
	private PcArmada pc_armada ;
	
	@ManyToOne
	@JoinColumn(name= "pieza_id", nullable= true)
	private Pieza pieza;
	
	@ManyToOne
	@JoinColumn(name= "usuario_id", nullable= false)
	private Usuario usuario;
	
	//@ManyToMany
//	@JoinTable(
	//		name="producto_tag",
		//	joinColumns = @JoinColumn(name="producto_id"),
		//	inverseJoinColumns = @JoinColumn(name="tag_id")
			//)
	//private List<Tag> tags;
	
	//Getters

	public Long getID() {
		return ID;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public Double getPreciocosto() {
		return preciocosto;
	}

	public Boolean getPcArmada() {
		return PcArmada;
	}

	public Marca getMarca() {
		return marca;
	}

	public PcArmada getPc_armada() {
		return pc_armada;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public Usuario getUsuario() {
		return usuario;
	}

//	public List<Tag> getTags() {
	//	return tags;
	//}
	
	//Setters

	public void setID(Long iD) {
		ID = iD;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public void setPreciocosto(Double preciocosto) {
		this.preciocosto = preciocosto;
	}

	public void setPcArmada(Boolean pcArmada) {
		PcArmada = pcArmada;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setPc_armada(PcArmada pc_armada) {
		this.pc_armada = pc_armada;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//public void setTags(List<Tag> tags) {
		//this.tags = tags;
	//}
	
	

}
