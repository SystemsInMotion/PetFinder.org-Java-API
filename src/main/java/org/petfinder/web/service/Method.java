package org.petfinder.web.service;

public enum Method {

	/* @formatter:off */
	AUTH_TOKEN("auth.getToken?"), 
	BREED_LIST("breed.list?"), 
	FIND_PET("pet.find?"), 
	FIND_SHELTER("shelter.find?"), 
	GET_PET("pet.get?"), 
	GET_SHELTER("shelter.get?"),
	RANDOM_PET("pet.getRandom?"), 
	SHELTER_PETS("shelter.getPets?"), 
	SHELTER_PETS_BY_BREED("shelter.listByBreed?");
	/* @formatter:on */

	public String value;

	private Method(String value) {
		this.value = value;
	}
}
