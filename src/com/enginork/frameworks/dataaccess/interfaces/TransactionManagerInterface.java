package com.enginork.frameworks.dataaccess.interfaces;

/**
 * This interface defines the methods which allow management of a data store transaction.
 * 
 * @author Chris Stone
 *
 */
public interface TransactionManagerInterface {
	/**
	 * Begin a data transaction.
	 * 
	 * @throws DataAccessException
	 */
	public void begin() throws DataAccessException;
	
	/**
	 * Finish and store a data transaction.
	 * 
	 * @throws DataAccessException
	 */
	public void commit() throws DataAccessException;
	
	/**
	 * Revert a data transaction which has not yet been committed.
	 * 
	 * @throws DataAccessException
	 */
	public void rollback() throws DataAccessException;
	
	/**
	 * Enable or disable automatically committing a statement on execution of the statement.
	 * 
	 * @param autoCommit The auto commit flag.
	 */
	public void autoCommit(boolean autoCommit);
}
