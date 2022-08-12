package farmer_exercise.orange;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
public class Orange {
    private int weight;
    private Color color;
}
