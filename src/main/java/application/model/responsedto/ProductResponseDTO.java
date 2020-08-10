
package application.model.responsedto;

import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDTO {
    private String name;
    private double price;
    private double discount;
    private String shortDescription;


}


