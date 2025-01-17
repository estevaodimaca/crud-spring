package mz.com.dimasoft.crudspring.auth.dto;

import mz.com.dimasoft.crudspring.auth.entity.role.Role;

public class RoleDTO {
	
	private Long id;
	private String description;
	private String authority;
	public RoleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleDTO(Long id, String description, String authority) {
		super();
		this.id = id;
		this.description = description;
		this.authority = authority;
	}
	public RoleDTO(Role role) {
		super();
		this.id = role.getId();
		this.description =role.getDescription();
		this.authority = role.getAuthority();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
