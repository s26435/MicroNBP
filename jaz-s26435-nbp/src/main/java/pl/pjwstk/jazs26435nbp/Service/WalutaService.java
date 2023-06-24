package pl.pjwstk.jazs26435nbp.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjwstk.jazs26435nbp.Model.Waluta;

@Service
public class WalutaService {
    public RestTemplate restTemplate;
    public WalutaService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Waluta getWalutaRatesFromDate(String code, String startDate, String endDate){
        return restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/A/{code}/{startDate}/{endDate}/",
                Waluta.class,
                code,
                startDate,
                endDate);
    }
}
