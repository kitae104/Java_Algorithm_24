package greedy.activity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Activity {
    private String name;
    private int startTime;
    private int finishTime;
}
