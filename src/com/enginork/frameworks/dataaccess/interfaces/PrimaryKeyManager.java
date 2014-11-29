package com.enginork.frameworks.dataaccess.interfaces;

import java.util.Collection;

/**
 * The primary key manager is responsible for managing implementation specific query strings using primary keys.
 * 
 * @author Chris Stone
 *
 */
public interface PrimaryKeyManager<K> {
	/**
	 * Get the list of primary keys.
	 * 
	 * @return The list of primary keys
	 */
	public Collection<K> getKeys();
	
	/**
	 * Add a primary key to the list.
	 * @param key The primary key
	 */
	public void addKey(K key);

	/**
	 * Add a collection of keys.
	 * 
	 * @param keyList The collection of keys
	 */
	public void addKeys(Collection<K> keyList);

	/**
	 * Remove a key.
	 * 
	 * @param key The key to remove
	 */
	public void removeKey(K key);

	/**
	 * Get the implementation specific query string for performing a search for data objects by their primary key.
	 * 
	 * @return The query string
	 */
	public String getQueryString();
}
