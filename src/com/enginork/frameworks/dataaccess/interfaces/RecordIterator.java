package com.enginork.frameworks.dataaccess.interfaces;

import java.util.Iterator;

/**
 * @author Chris Stone
 *
 */
public interface RecordIterator<T extends DataObject> extends Iterator<T> {
	/**
	 * Close any record set associated resources.
	 */
	public void close();
}
