package profiles;

public class Profile {
	private long profileId;
	private String firstName;
	private String lastName;
	private String email;

	public Profile(){}

	public Profile(String firstName, String lastName, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId(){
		return profileId;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}
	public String getEmail(){
		return email;
	}
	public void setProfileId(long profileId){
		this.profileId = profileId;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setEmail(String email){
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("id: "+ getId()+ " Name: "+ getFirstName()+" "+ getLastName()+ " Email "+
		getEmail());
	}

}
