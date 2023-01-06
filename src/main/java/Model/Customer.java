package Model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Customer {
    private int Customer_id;
    private String name;
    private List<customerAddress> custAddress;

    private String email;
    private String Phonenumber;

    @Data
    @Builder(toBuilder = true)
    public static class customerAddress{
        private String doorNo;
        private String streetName;
        private String city;
        private String LandMark;
        private Long Pincode;
    }

}
