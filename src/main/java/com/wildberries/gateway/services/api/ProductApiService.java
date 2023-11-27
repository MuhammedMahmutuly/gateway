package com.wildberries.gateway.services.api;

import com.wildberries.gateway.dto.ProductDTO;
import com.wildberries.gateway.dto.ProductDTO2;
import com.wildberries.gateway.dto.ProductDTO3;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.util.List;

@Service
public class ProductApiService {
//    public List<ProductDTO> getAllProducts() throws IOException {
//        // Создаем экземпляр JsonRpcHttpClient с указанием URL удаленного сервиса
//        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8090/getAllProducts"));
//
//        // Используем AutoJsonRpcClientProxyCreator для создания клиентского прокси
//        AutoJsonRpcClientProxyCreator proxyCreator = new AutoJsonRpcClientProxyCreator();
//        List<ProductDTO> productListDTO = ProxyUtil.createClientProxy(getClass().getClassLoader(), List.class, client);
//        productListDTO.
//    }


    //Через WebClient обращаемся к другому микросервису.
    public List<ProductDTO> getAllProducts() throws IOException {
        WebClient webClient = WebClient.create();

        WebClient.ResponseSpec response = webClient.get()
                .uri("http://localhost:8090/getAllProducts") // Замените на свой URL
                .retrieve();
        Flux<ProductDTO> dataFlux = response.bodyToFlux(ProductDTO.class);
        return dataFlux.collectList().block();
    }

    public List<ProductDTO> getAllProductsByType(String type) throws IOException {
        WebClient webClient =  WebClient.builder()
                .baseUrl("http://localhost:8090")
                .build();

        return webClient.get()
                .uri("/getAllProductsByType?type=" + type)
                .retrieve()
                .bodyToFlux(ProductDTO.class)
                .collectList()
                .block();
    }

    public List<ProductDTO2> getAllByName(String type) throws IOException {
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8090")
                .build();

        return webClient.get()
                .uri("/getAllByName?type=" + type)
                .retrieve()
                .bodyToFlux(ProductDTO2.class)
                .collectList()
                .block();

    }

    public List<ProductDTO3> getAllByTypeAndModel(String name) throws IOException {
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8090")
                .build();


        return webClient.get()
                .uri("getAllByTypeAndModel?name=" + name)
                .retrieve()
                .bodyToFlux(ProductDTO3.class)
                .collectList()
                .block();
    }


    //Через RestTemplate обращаемся к другому микросервису.

//    public List<ProductDTO> getAllProducts() throws IOException {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8090/getAllProducts";
//        List<ProductDTO> response = restTemplate.getForObject(url, List.class);
//        return response;
//    }
}