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
@Table(name = "customer_infos")
public class CustomerInfo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerInfoId;
	
	@Column(columnDefinition = "varchar(100) not null")
	private String customerName;
	
	@Column(name = "phone_number")
	private Integer phoneNumber;
	
	@Column(columnDefinition = "varchar(100) not null")
	private String address;
	
	@Column(columnDefinition = "varchar(100) not null")
	private String email;
}
