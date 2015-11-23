package spittr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spitter {
	
	private long id;
	@NotNull
	@Size(min=2, max=30)
	private String firstName;
	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	@NotNull
	@Size(min=5, max=16)
	private String username;
	@NotNull
	@Size(min=5, max=25)
	private String password;
	
	public Spitter(){
		
	}
	
	public Spitter(String username, String password, String firstName, String lastName){
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Spitter(long id, String username, String password, String firstName, String lastName){
		this(username,password,firstName,lastName);
		this.id = id;
	}
	
	public long getId(){
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object that){
		return EqualsBuilder.reflectionEquals(this,that,"id","username");
	}
	
	@Override
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this,"id","username");
	}
	

}
