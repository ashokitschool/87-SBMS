package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.UserInfo;
import jakarta.transaction.Transactional;

//@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

	// *********************** Find By Methods ******************************** //

	// select * from user_info where country=?
	public List<UserInfo> findByCountry(String country);

	// select * from user_info where gender=?
	public List<UserInfo> findByGender(String gender);

	// select * from user_info where age >= ?
	public List<UserInfo> findByAgeGreaterThanEqual(Integer age);

	// select * from user_info where country=? and gender=?
	public List<UserInfo> findByCountryAndGender(String country, String gender);

	// *********************** Custom Queries (DQL) ********************************//

	@Query(value = "select * from user_info", nativeQuery = true)
	public List<UserInfo> getData();

	@Query(value = "From UserInfo")
	public List<UserInfo> getData1();

	// *********************** Custom Queries (DML) ********************//

	@Modifying
	@Transactional
	@Query("delete from UserInfo where id=:userId")
	public void deleteUser(Integer userId);

}












