package mz.com.dimasoft.crudspring.auth.dto;

import java.util.HashSet;
import java.util.Set;

import mz.com.dimasoft.crudspring.auth.entity.user.User;

public class UserDTO {

	private Long id;
	private String username;
	private String name;
	private String surname;
	private String password;
	private String fullNormalizedName;
	private String nuit;
	private Set<RoleDTO> roles = new HashSet<>();

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(Long id, String username, String name, String surname, String password, String fullNormalizedName,
			String nuit) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.fullNormalizedName = fullNormalizedName;
		this.nuit = nuit;
		// this.roles = roles;
	}

	public UserDTO(User user) {
		super();
		this.id = user.getId();
		this.username = user.getUsername();
		this.name = user.getName();
		this.surname = user.getSurname();
		this.password = user.getPassword();
		this.fullNormalizedName = user.getFullNormalizedName();
		this.nuit = user.getNuit();
		user.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullNormalizedName() {
		return fullNormalizedName;
	}

	public void setFullNormalizedName(String fullNormalizedName) {
		this.fullNormalizedName = fullNormalizedName;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDTO> roles) {
		this.roles = roles;
	}
}
