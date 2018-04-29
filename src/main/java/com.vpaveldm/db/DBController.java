package com.vpaveldm.db;

import com.vpaveldm.entity.LocalNetwork;
import com.vpaveldm.entity.Standard;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DBController {

    public void add(@NonNull LocalNetwork network) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        restTemplate.postForObject("http://localhost:8080/addLocalNetwork", network, LocalNetwork.class);
    }

    public void remove(int id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        restTemplate.delete("http://localhost:8080/removeLocalNetwork/" + id);
    }

    public void change(@NonNull LocalNetwork network) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
        restTemplate.put("http://localhost:8080/changeLocalNetwork", network, LocalNetwork.class);
    }

    public List<LocalNetwork> getNetworks() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        ResponseEntity<LocalNetwork[]> responseEntity = restTemplate.getForEntity("http://localhost:8080/getLocalNetwork", LocalNetwork[].class);
        return Arrays.asList(responseEntity.getBody());
    }
}
