
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class Accommodation {
    private int id;
    private String type;
    private String bedType;
    private int maxGuests;
    private String description;
}
