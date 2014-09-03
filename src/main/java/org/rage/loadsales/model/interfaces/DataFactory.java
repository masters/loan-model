/**
 * 
 */
package org.rage.loadsales.model.interfaces;


/**
 * @author <roar109@gmail.com> Hector Mendoza
 *
 */
public interface DataFactory<T, S> {

	void preConfiguration() throws Exception;
	void connect();
	void shutdown();
	T getDB(String dbName);
	S getCollection(String collectionName);
}
