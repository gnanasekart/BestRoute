package Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class DeliveryBoy {

    private int deliveryBoyId;
    private String name;
    private String vechileDetail;
    private String star;
    private String delPhoneNumber;
}
