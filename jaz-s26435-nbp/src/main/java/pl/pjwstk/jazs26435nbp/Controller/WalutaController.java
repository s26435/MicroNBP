package pl.pjwstk.jazs26435nbp.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjwstk.jazs26435nbp.Model.Waluta;
import pl.pjwstk.jazs26435nbp.Service.WalutaService;

@RestController
@RequestMapping("/Average")
public class WalutaController {
    private final WalutaService walutaService;
    public WalutaController(WalutaService walutaService){
        this.walutaService = walutaService;
    }

    @Operation(summary = "Pobiera kod waluty(np. EUR) potem datę (w formacie RRRR-MM-DD) startu i datę  końca pobierania zakresu")
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description = "Poprawnie pobrano kursy waluty z bazy."),
            @ApiResponse(responseCode = "404", description = "Nie znaleziono kursów", content = @Content),
            @ApiResponse(responseCode = "400", description = "Złe zapytanie",content = @Content),
            @ApiResponse(responseCode = "500", description = "Błąd serwera", content = @Content)
    })
    @GetMapping("/{waluta}/{startDate}/{endDate}")
    public ResponseEntity<Waluta> getWalutaFromDate(@PathVariable String waluta,
                                                    @PathVariable String startDate,
                                                    @PathVariable String endDate) {
        walutaService.getWalutaRatesFromDate(waluta,startDate,endDate);
        return ResponseEntity
                .ok()
                .build();
    }
}
