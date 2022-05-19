package ro.sd.a2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDataDto {
    public String name;
    public String description;
    public float rating;
}
