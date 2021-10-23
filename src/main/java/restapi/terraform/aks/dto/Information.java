package restapi.terraform.aks.dto;

import java.time.Instant;


public class Information {

    private Instant currentDateTime = Instant.now();
    private String message = "Automate All The Things";

    public Instant getCurrentDateTime() {
        return currentDateTime;
    }

    public String getMessage() {
        return message;
    }
}
