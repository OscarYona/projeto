package projeto.example.demo.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity
@Table(name="PcArmada")

public class PcArmada {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@OneToMany(mappedBy = "PcArmada")
	private Set<Producto> producto;
	
	@NotBlank
	private String nombre;
	
	@NotBlank
	@Lob
	private String descripcion;
	
	
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy'MM'DD hh:mm:ss")
	private LocalDateTime created_at;
	
	@JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy'MM'DD hh:mm:ss")
	private LocalDateTime updated_at;

	
	//Getters
	public Long getId() {
		return Id;
	}

	public Set<Producto> getProducto() {
		return producto;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	
	//Setters

	public void setId(Long id) {
		Id = id;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	
	
	

}
