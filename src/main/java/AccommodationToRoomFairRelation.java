import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccommodationToRoomFairRelation {
    private int id;
    private int idAccommodation;
    private int idRoomFair;
}
