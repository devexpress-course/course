package devexpress.course.course.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CourseDTO {

    @JsonProperty
    private String title;

}
