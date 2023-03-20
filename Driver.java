public class Driver extends UserBasicInfo {

    private Vehicle curretCab;

    public Driver(String _name,Integer _phoneNumber,String _sex,Integer _rating,Vehicle cab)
    {
        super(_name,_phoneNumber,_sex);
        curretCab = cab;

    }


    public Integer getVehileCapacity()
    {
        return curretCab.capacity;
    }

    
}
