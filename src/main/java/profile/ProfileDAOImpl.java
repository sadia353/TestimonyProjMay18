package profile;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProfileDAOImpl implements ProfileDAO{

	private JdbcTemplate jdbcTemplate;
	
	public ProfileDAOImpl(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Override
	public long createProfile(Profile profile) {
		String sql = "INSERT INTO profiles (profile_id, first_name, last_name, email) "+
					  "VALUES (uuid_generate_v4(), ?, ?, ?)"; //RETURNING user_id
		jdbcTemplate.update(sql, profile.getFirstName(), profile.getLastName(), profile.getEmail());
		return 1;
	}

	@Override
	public boolean updateProfile(long profileId, Profile profile) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Profile getProfile(long profileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProfile(long profileId) {
		// TODO Auto-generated method stub
		
	}
	

}
