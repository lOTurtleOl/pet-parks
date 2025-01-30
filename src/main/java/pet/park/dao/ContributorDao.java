/**
 * 
 */
package pet.park.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pet.park.entity.Contributor;

/**
 * 
 */
public interface ContributorDao extends JpaRepository<Contributor, Long> {

	/**
	 * @param contributorEmail
	 * @return
	 */
	Optional<Contributor> findByContributorEmail(String contributorEmail); // will return a contributor if it finds one, and an optional if not. Name is important, it must be the name of the java field value that we want to find. This way it writes our sql statement for us 

}
