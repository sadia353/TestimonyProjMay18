package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
	
	@Autowired
	private ProfileDAO profileDAO;
	
	@RequestMapping(method = RequestMethod.POST)
	public long createProfile(@RequestBody Profile profile){
		
		return profileDAO.createProfile(profile);		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Profile getProfile(@PathVariable long id){
		Profile profile = new Profile("TestName", "LastName", "test@email.com");
		profile.setProfileId(id);
		return profile;
	}
}
