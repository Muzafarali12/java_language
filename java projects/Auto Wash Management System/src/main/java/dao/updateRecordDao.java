package dao;

import model.Car;

public interface updateRecordDao {
	boolean updateRecord(Car car);
	Car getCarByEngineNumber(int engineNumber);
}
