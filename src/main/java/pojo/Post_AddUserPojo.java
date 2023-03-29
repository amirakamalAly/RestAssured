package pojo;

public class Post_AddUserPojo {
	
	
	private String firstName;
	private String lastName;
	private String email;
	private Boolean  active;

	public Post_AddUserPojo(String firstName,String lastName, String email,Boolean  active) {
		// TODO Auto-generated constructor stub
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.active=active;
	}

	/**
	 * @return the firstName
	 */
	public String getMobilenumber() {
		return firstName;
	}

	/**
	 * @param mobilenumber the firstName to set
	 */
	public void setMobilenumber(String mobilenumber) {
		this.firstName = mobilenumber;
	}

	
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Post_AddUserPojo [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", active="
				+ active + "]";
	}
	
	
	
}
