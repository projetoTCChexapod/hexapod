package br.com.hexapod.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "treinamento")
public class Treinamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
}
