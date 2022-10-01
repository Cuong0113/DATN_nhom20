package fpt.edu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	
	@Column(name= "password", columnDefinition = "varchar(50) not null")
	private String password;
	
	@Column(name= "account_name", columnDefinition = "varchar(100) not null")
	private String accountName;
	
	@Column(name= "phone_number")
	private Integer phoneNumber;
	
	@Column(columnDefinition = "varchar(100) not null")
	private String address;
	
	@Column(columnDefinition = "varchar(100) not null")
	private String email;
	
	@Column(nullable = false)
	private Integer status;
	
	@Column(nullable = false)
	private String role;
}
