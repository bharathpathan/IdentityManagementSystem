/**
 * 
 */
package fr.epita.core.exception;

/**
 * @author bharath
 *
 */
public class DAODeleteException extends Exception {

	
private String deleteFault;
	
	public DAODeleteException(String message) {
		this.deleteFault = message;
	}

	public String getSaveFault() {
		return deleteFault;
	}

}
