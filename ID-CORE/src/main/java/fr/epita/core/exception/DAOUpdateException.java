/**
 * 
 */
package fr.epita.core.exception;

/**
 * @author bharath
 *
 */
public class DAOUpdateException extends Exception {
	
    private String saveFault;
	
	public DAOUpdateException(String message) {
		this.saveFault = message;
	}

	public String getSaveFault() {
		return saveFault;
	}

}
