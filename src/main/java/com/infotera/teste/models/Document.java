package com.infotera.teste.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Entity
@Table(name = "document")
public class Document {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;
	
	@Column(name = "nr_document", length = 45, nullable = false)
    private String documentNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tp_document", length = 45, nullable = false)
    private DocumentType type;

	public enum DocumentType {
        CPF, RG, CNH, RNE, CIE, PASSPORT
    }
	
	public Long getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}
	
	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public DocumentType getType() {
		return type;
	}

	public void setType(DocumentType type) {
		this.type = type;
	}
	
}
