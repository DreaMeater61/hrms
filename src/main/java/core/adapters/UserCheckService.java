package core.adapters;

public interface UserCheckService {
	
	boolean checkIfRealPerson(String identityNumber, String name, String lastName, String birthYear);
}
