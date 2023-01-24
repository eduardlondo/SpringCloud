package co.edu.eafit.bank.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */
@Entity
@Table(name = "transaction_type", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionType implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "trty_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trtyId;

	
	@Column(name = "enable", nullable = false)
	private String enable;
	
	@Column(name = "name", nullable = false)
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transactionType")
	private List<Transaction> transactions = new ArrayList<>();

}