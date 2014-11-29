package com.enginork.frameworks.dataaccess.interfaces;

import java.util.List;

/**
 * A data mapper maps data from a datastore specific set of results to domain objects.
 * 
 * @author Chris Stone
 *
 * @param <T> The type of domain objects which can be mapped.
 * @param <R> The type of results which can be mapped.
 */
public interface DataMapper<T extends DataObject, R> {
	/**
	 * Map the results to a collection of data objects.
	 * 
	 * @param results The results
	 * @return The data objects
	 */
	public List<T> map(R results) throws DataAccessException;
	
	/**
	 * Map the next record in the results to a data object.
	 * 
	 * @param results The results
	 * @return The data object
	 */
	public T mapNext(R results) throws DataAccessException;
}
