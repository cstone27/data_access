package com.enginork.frameworks.dataaccess.interfaces;

import java.util.List;

/**
 * The data access object provides the mechanisms for communicating with the data store.
 * 
 * @author Chris Stone
 * @param T The domain object type
 */
public interface DataAccessObject<T extends DataObject> {
	public List<T> findAll(ParameterManager<T, ?> params) throws DataAccessException;
	public RecordIterator<T> find(ParameterManager<T, ?> paramList) throws DataAccessException;
	public int save(T dvo) throws DataAccessException;
	public int save(List<T> dvoList) throws DataAccessException;
}
