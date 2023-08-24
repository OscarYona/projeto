	package projeto.example.demo.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name="marca")
public class Marca {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	
	@NotBlank
	private String nombre;
	
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy'MM'DD HH:mm:ss")
	private LocalDateTime created_at;
	
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy'MM'DD HH:mm:ss")
	private LocalDateTime updated_at;
	
	@OneToMany(mappedBy = "marca")
	private Set<Producto> producto;

	//Getters y Setters	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		this.ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nome) {
		this.nombre = nome;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getupdated_at() {
		return updated_at;
	}

	public void setupdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	
	
	

}
