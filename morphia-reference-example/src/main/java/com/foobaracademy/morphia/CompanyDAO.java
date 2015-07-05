package com.foobaracademy.morphia;

import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

public interface CompanyDAO extends DAO<Company, ObjectId>{
}
