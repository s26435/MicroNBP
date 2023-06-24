package pl.pjwstk.jazs26435nbp.Model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Schema(name = "Waluta", description = "Model waluty zawierający No, datę i kurs waluty")
public class Waluta {
    @Schema(description = "No")
    @NotNull
    private String No;
    @Schema(description = "Data z której pochodzi kurs")
    @NotNull
    private String EffectiveDate;
    @Schema(description = "Kurs wymiany na złotówki")
    @Size(min = 3, max=3)
    @NotNull
    private float Mid;
}


