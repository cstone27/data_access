package com.enginork.frameworks.dataaccess.interfaces;

/**
 * 
 * @author Chris Stone
 *
 * @param <K> The type of the primary key for the data object.
 */
public interface DataObject {
	/**
	 * Flag to indicate whether or not the data in this object instance has been modified and should be updated in 
	 * the data store when saved.
	 * 
	 * @return The modified flag
	 */
	public boolean isModified();
	
	/**
	 * Flag to indicate whether or not the data in this object instance is new data which should be created in 
	 * the data store when saved.
	 * 
	 * @return The new object flag
	 */
	public boolean isNew();
	
	/**
	 * Flag to indicate whether or not the data contained in this object instance should be deleted from
	 * the data store when saved.
	 * 
	 * @return The deleted flag
	 */
	public boolean isDeleted();
	
	/**
	 * Set the modified flag.
	 * 
	 * @param isModified The modified flag
	 */
	public void setIsModified(boolean isModified);
	
	/**
	 * Set the new flag.
	 * 
	 * @param isNew The value for the new flag
	 */
	public void setIsNew(boolean isNew);
	
	/**
	 * Set the deleted flag.
	 * 
	 * @param isDeleted The value for the deleted flag.
	 */
	public void setIsDeleted(boolean isDeleted);	
}
