package profile;

//Provides the interface for CRUD operations on the data source
public interface ProfileDAO {	
	/**
	 *  Creates a new profile 
	 *  @param profile: A profile object 
	 *  @returns long: the profileId if successful, -1 if error
	 */
	public long createProfile(Profile profile);
	
	/**
	 * @param profile: profile object
	 * @return boolean, true if successful update, else false
	 */
	public boolean updateProfile(long profileId, Profile profile);
	
	/**
	 * @param profileId
	 * @return a profile object if successful, else null
	 */
	public Profile getProfile(long profileId);
	
	/**
	 * Delete a profile using the profileId
	 * @param profileId 
	 */
	public void deleteProfile(long profileId);	

}
