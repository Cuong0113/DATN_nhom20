package fpt.edu.entity;

import java.io.Serializable;
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
@Table(name = "discounts")
public class Discount implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long discountId;
	
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "event_name", columnDefinition = "varchar(100) not null")
	private String eventName;
	
	@Column(name = "created_by", columnDefinition = "varchar(100) not null")
	private String createdBy;
	
	@Column(name = "start_time")
	private Instant startTime;
	
	@Column(name = "end_time")
	private Instant endTime;
	
	@Column
	private Integer percent;
}
