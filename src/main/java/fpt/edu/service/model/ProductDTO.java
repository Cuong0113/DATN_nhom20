package fpt.edu.service.model;

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

public class ProductDTO{
	
	private Long productId;
	
	private String productName;
	
	private BigDecimal quantity;
	
	private BigDecimal priceIn;
	
	private BigDecimal priceTag;
	
	private Long categoryId;
	
	private Integer status;
	
	private Boolean deleted;
	
	private String createdBy;
	
	private Instant createdTime;
	
	private String lastModifedBy;
	
	private Instant lastModifedTime;
	
	
}
