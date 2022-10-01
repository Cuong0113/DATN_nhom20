package fpt.edu.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "order_details")
public class OrderDetail implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderDetailId;
	
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "order_id")
	private Long orderId;
	
	@Column(name = "discount_id")
	private Long discountId;
	
	@Column
	private BigDecimal price;
	
	@Column
	private BigDecimal quantity;
}
