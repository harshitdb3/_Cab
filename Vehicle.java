public class Vehicle {

    String registeredNumber;
    String vehicleModel;
    int capacity;

    public Vehicle(String _registeredNumber,String _vehicleModel,int _capacity)
    {
        registeredNumber = _registeredNumber;
        vehicleModel = _vehicleModel;
        capacity = _capacity;
    }

    public int GetCapacity()
    {
        return capacity;
    }

    public String GetVehicleModel()
    {
        return vehicleModel;
    }

    public String GetVehicleRegisteredNumber()
    {
        return registeredNumber;
    }
    
}


