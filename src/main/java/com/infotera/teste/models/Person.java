package com.infotera.teste.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nm_person", length = 200, nullable = false)
    private String name;
	
	@Column(name = "tp_person", length = 2, nullable = false)
    private String type;
	
	@Column(name = "nm_email", length = 200, nullable = false)
    private String email;
	
	@Column(name = "nr_telephone", length = 200, nullable = false)
    private String telephone;

	@OneToMany(
			targetEntity = Document.class,
			mappedBy = "person", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true,
			fetch = FetchType.EAGER
	)
	 private List<Document> documents;
	 
	@OneToMany(
			targetEntity = Address.class,
			mappedBy = "person", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true,
			fetch = FetchType.EAGER
	)
	 private List<Address> addresses;
	
	@OneToMany(
			targetEntity = Contact.class,
			mappedBy = "person", 
			cascade = CascadeType.ALL, 
			orphanRemoval = true,
			fetch = FetchType.EAGER
	)
	 private List<Contact> contacts;
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    
    public void addDocument(Document document) {
    	this.documents.add(document);
    }
	
	public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    
    public void addAddress(Address address) {
    	this.addresses.add(address);
    }
    
	public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public void addContact(Contact contact) {
    	this.contacts.add(contact);
    }
}


