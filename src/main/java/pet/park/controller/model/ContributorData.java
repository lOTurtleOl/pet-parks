/**
 * 
 */
package pet.park.controller.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.Value;
import pet.park.entity.GeoLocation;

/**
 * 
 */
@Data
public class ContributorData {
	private Long contributorId;   // looks like contributor_id
	private String contributorName;
	private String contributorEmail;
	private Set<PetParkResponse> petParks = new HashSet<>();
	
	@Value
	static class PetParkResponse {
		private Long petParkId;
		private String parkName;
		private String directions;
		private String stateOrProvince;
		private String country;
		private GeoLocation geoLocation;
		private Set<String> amenities = new HashSet<>();
	}
}
