package org.example.patterns.state.trucks.interfaces;

import org.example.patterns.exceptions.CustomException;
import org.example.patterns.state.trucks.enums.TruckStates;
import org.example.patterns.state.trucks.model.Truck;

public interface State {

    void changeDriver(Truck truck) throws CustomException;

    void startDriving(Truck truck) throws CustomException;

    void startRepair(Truck truck) throws CustomException;

    TruckStates getStateMessage();
}
