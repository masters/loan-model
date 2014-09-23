package org.rage.loan.model.interfaces;

import java.util.List;

import org.rage.loan.exception.RageDataException;
import org.rage.loan.model.ServiceResponse;

public interface DataProvider<T> {

	ServiceResponse save(T instance) throws RageDataException;
	T get(String id);
	ServiceResponse delete(String id);
	ServiceResponse update(T instance) throws RageDataException;
	List<T> getAll();
	List<T> getAllByPerson(String personId);
}
