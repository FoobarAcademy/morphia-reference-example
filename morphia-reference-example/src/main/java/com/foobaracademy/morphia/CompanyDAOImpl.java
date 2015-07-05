package com.foobaracademy.morphia;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;

public class CompanyDAOImpl extends BasicDAO<Company, ObjectId> implements CompanyDAO{

	public CompanyDAOImpl(Class<Company> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

}
