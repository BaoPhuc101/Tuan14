package vn.iotstar.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "NVARCHAR(255)")
	private String name;
	@Column(columnDefinition = "NVARCHAR(255)")
	private String brand;
	@Column(columnDefinition = "NVARCHAR(255)")
	private String madein;
	private float price;
}
