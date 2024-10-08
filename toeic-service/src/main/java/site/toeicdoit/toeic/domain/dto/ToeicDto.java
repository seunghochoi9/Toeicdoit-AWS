package site.toeicdoit.toeic.domain.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class ToeicDto {

    private Long id;
    private Long level;
    private String question;
    private String answer;
    private String description;
    private String image;
    private String sound;
    private String script;
    private String title;
    private boolean take;

    private String createdAt;
    private String updatedAt;

}