package com.zettamine.hibernate.entities;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "product")
@Data
public class Product {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_generator")
	@SequenceGenerator(name ="pid_generator", sequenceName = "prod_sequence", initialValue = 100, allocationSize = 1)
	@Column(name = "prod_id")
	private int productId;
	
	@Column(name = "prod_name")
	private String productName;
	
	@Column(name = "prod_price")
	private float productPrice;

	public Product(String productName, float productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
}
