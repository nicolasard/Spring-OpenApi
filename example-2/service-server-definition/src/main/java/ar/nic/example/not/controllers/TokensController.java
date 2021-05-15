package ar.nic.example.not.controllers;

import ar.nic.example.openapi.DefaultApi;
import ar.nic.example.openapi.model.Card;
import ar.nic.example.openapi.model.Token;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class TokensController implements DefaultApi {

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<List<Token>> cardGet() {
        List<Token> ltoken = new ArrayList<Token>();
        ltoken.add(new Token(){{setToken("asd-agsf");setName("Jon Doe");setBrand("VISA");setValidFrom("2020-01-01");setValidTo("2020-01-30");}});
        ltoken.add(new Token(){{setToken("asd-fasg");setName("Jon Doe");setBrand("MASTERCARD");setValidFrom("2020-01-01");setValidTo("2020-01-30");}});
        ltoken.add(new Token(){{setToken("asd-adga");setName("Jon Doe");setBrand("AMEX");setValidFrom("2020-01-01");setValidTo("2020-01-30");}});
        ltoken.add(new Token(){{setToken("asd-gdgd");setName("Jon Doe");setBrand("VISA");setValidFrom("2020-01-01");setValidTo("2020-01-30");}});

        return new ResponseEntity<List<Token>>(ltoken, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Token> cardPost(@Valid Card card) {
        return null;
    }
}
