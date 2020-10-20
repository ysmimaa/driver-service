package com.driver.ms.service;

import com.driver.ms.entity.ContractType;
import com.driver.ms.entity.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {

    /**
     * Method that return the list of driver
     * @return a list of driver
     */
    List<Driver> getListOfDriver();

    /**
     * Method for creating a driver
     * @param driver
     * @return the driver created
     */
    Driver createDriver(Driver driver);

    /**
     * Method that return a list of found drivers base on the criteria
     * @return list of dirvers found
     */
    List<Driver> findByFirstname(String name);

    /**
     * Method that update an existing driver
     * @param driver given driver
     * @return the driver that has been updated
     */
    Driver updateDriver(Driver driver);

    /**
     * Method that return a driver by his id
     * @param id given id
     * @return the driver if exist
     */
    Driver findDriverById(Long id);
}
