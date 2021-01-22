package tn.iit.medicalfile.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import tn.iit.medicalfile.dto.MedicamentDto;
import tn.iit.medicalfile.utils.Links;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class StoreManagementClientService {
    private Logger logger = LoggerFactory.getLogger (StoreManagementClientService.class);
    private final RestTemplate restTemplate;

    public StoreManagementClientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<MedicamentDto> getAllMedicaments(){
        logger.debug("Getting all medicaments");
        UriComponents uriComponents= UriComponentsBuilder.fromUriString (Links.MEDICAMENTS).build ().encode ();
        return restTemplate.exchange (uriComponents.toUri (),
                HttpMethod.GET,
                new HttpEntity<> (null,new HttpHeaders ()),
                new ParameterizedTypeReference<List<MedicamentDto>> (){}).getBody ();
    }

    public MedicamentDto getMedicamentById(Long id){
        logger.debug ("Getting Medicament with id {}",id);
        UriComponents uriComponents= UriComponentsBuilder.fromUriString (Links.MEDICAMENTS)
                .path ("/{id}")
                .build ()
                .expand (id)
                .encode ();
        return restTemplate.exchange (uriComponents.toUri (),
                HttpMethod.GET,
                new HttpEntity<> (null,new HttpHeaders ()),
                MedicamentDto.class).getBody ();
    }

    public List<MedicamentDto> getMedicamentsByIds(List<Long> ids){
        this.logger.debug ("Getting Medicaments with ids {}",ids);
        UriComponents uriComponents= UriComponentsBuilder.fromUriString (Links.MEDICAMENTS+"/searches")
                .build ()
                .encode ();
        return restTemplate.exchange (uriComponents.toUri (),
                HttpMethod.POST,
                new HttpEntity<> (ids,new HttpHeaders ()),
                new ParameterizedTypeReference<List<MedicamentDto>> (){}).getBody ();
    }
}
