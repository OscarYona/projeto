package projeto.example.demo.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="Pieza")

public class Pieza {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	
	@ManyToOne
	@JoinColumn(name= "tipo_pieza_id", nullable= false)
	private TipoPieza tipo_pieza;
	
	@OneToMany(mappedBy = "pieza")
	private Set<Producto> producto;
	
	@NotBlank
	private Double Capacidad;
	
	@NotBlank
	private String UnidadMedida;
	
	@NotBlank
	private int Cantidad;
	
	@NotBlank
	private String Nombre;
	
	@NotBlank
	@Lob
	private String Descripcion;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/DD  HH:mm:ss")
	private LocalDateTime created_at;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/DD  HH:mm:ss")
	private LocalDateTime updated_at;
	
	
//Getters
	public Long getID() {
		return ID;
	}

	public TipoPieza getTipo_pieza() {
		return tipo_pieza;
	}

	public Set<Producto> getProducto() {
		return producto;
	}

	public Double getCapacidad() {
		return Capacidad;
	}

	public String getUnidadMedida() {
		return UnidadMedida;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	
	//Setters

	public void setID(Long iD) {
		ID = iD;
	}

	public void setTipo_pieza(TipoPieza tipo_pieza) {
		this.tipo_pieza = tipo_pieza;
	}

	public void setProducto(Set<Producto> producto) {
		this.producto = producto;
	}

	public void setCapacidad(Double capacidad) {
		Capacidad = capacidad;
	}

	public void setUnidadMedida(String unidadMedida) {
		UnidadMedida = unidadMedida;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
