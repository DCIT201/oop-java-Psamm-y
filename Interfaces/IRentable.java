package Interfaces;

import Classes.Customer;

public interface IRentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
