package Model;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder(toBuilder = true)
public class Resturant {

    private int resturantId;
    private String resturantName;
    private List<ResturantAddress> resturantAddress;
    private List<MenuItem> menu;


    @Data
    @Builder(toBuilder = true)
    public static class ResturantAddress{
        private String doorNo;
        private String streetName;
        private String city;
        private String LandMark;
        private Long Pincode;
        private Double RestLat;
        private Double RestLng;
    }

    @Data
    @Builder(toBuilder = true)
    public static class MenuItem{
        private String briyani;
        private String noodles;
        private String dosa;
        private String rice;
    }
}
