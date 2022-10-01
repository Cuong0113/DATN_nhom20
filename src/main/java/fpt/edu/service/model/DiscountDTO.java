package fpt.edu.service.model;

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
public class DiscountDTO{
	private Long discountId;

	private Long productId;

	private String eventName;
	
	private String createdBy;
	
	private Instant startTime;
	
	private Instant endTime;
	
	private Integer percent;
}
