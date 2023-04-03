package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class Fileindexed extends AbstractEvent {

    private Long id;
    private String field;
    private List<String> keywords;
}
