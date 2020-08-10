package application.model.entity;
import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "category")
public class Category {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    @Column
    private Date createdDate;
    @Column
    private String name;

}
