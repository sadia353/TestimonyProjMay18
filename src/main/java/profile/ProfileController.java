package profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/profiles")
public class ProfileController {
	
	@Autowired
	private ProfileDAO profileDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Profile getProfile(){
		Profile profile = new Profile("first","last", "test@email.com");
		profile.setId(1);
		return profile;
	}
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public long createProfile(@RequestBody Profile profile){
		return profileDAO.createProfile(profile);
	}

}
