package id.ten.projectboard_api.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String summary;
    private String acceptanceCriteria;
    private String status;

}
