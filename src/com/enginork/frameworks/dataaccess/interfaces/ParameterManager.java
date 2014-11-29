package com.enginork.frameworks.dataaccess.interfaces;

import java.util.Collection;

/**
 * A parameter manager is responsible for managing the parameters for a query and generating domain specific
 * query strings for the given list of parameters. For instance, an RDBMS implementation may generate the SQL where clause
 * for a query, whereas a RESTful implementation may generate URL parameters for a REST web service.
 * 
 * @param P The parameter object which is managed by this instance
 * @param S The type of statement the manager creates
 * 
 * @author Chris Stone
 *
 */
public interface ParameterManager<P, S> {
	/**
	 * Retrieve the list of parameters.
	 * 
	 * @return The list of parameters
	 */
	public Collection<P> getParams();
	
	/**
	 * Add a query parameter.
	 * 
	 * @param param The query parameter
	 */
	public void addParam(P param);
	
	/**
	 * Add a collection of parameters.
	 * 
	 * @param params The parameter collection
	 */
	public void addParams(Collection<P> params);
	
	/**
	 * Remove a parameter.
	 * 
	 * @param param The parameter to remove from the query
	 */
	public void removeParam(P param);
	
	/**
	 * Get the implementation specific parameter query string.
	 * 
	 * @return The query string
	 */
	public S getQueryStatement();
	
	public S getUpdateStatement();
	
	public S getCreateStatement();
	
	public S getDeleteStatement();
}
