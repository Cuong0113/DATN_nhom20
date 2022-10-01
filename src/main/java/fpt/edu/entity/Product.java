package fpt.edu.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "products")
public class Product implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	
	@Column(name = "product_name", columnDefinition = "nvarchar(100) not null")
	private String productName;
	
	@Column(nullable = false)
	private BigDecimal quantity;
	
	@Column(name = "price_in", nullable = false)
	private BigDecimal priceIn;
	
	@Column(name = "price_tag", nullable = false)
	private BigDecimal priceTag;
	
	@Column(name= "category_id", nullable = false)
	private Long categoryId;
	
	@Column(nullable = false)
	private Integer status;
	
	@Column(nullable = false)
	private Boolean deleted;
	
	@Column(name = "created_by", columnDefinition = "nvarchar(100) not null")
	private String createdBy;
	
	@Column(name = "created_time")
	private Instant createdTime;
	
	@Column(name = "last_modifed_by", columnDefinition = "nvarchar(100) not null")
	private String lastModifedBy;
	
	@Column(name = "last_modifed_time")
	private Instant lastModifedTime;
	
	
}
