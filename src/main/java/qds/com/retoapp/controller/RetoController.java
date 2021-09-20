package qds.com.retoapp.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import qds.com.retoapp.repository.TransformarMatriz;

import java.util.Arrays;

/*
 * Controller RetoController
 * retorna matriz rotada 90 antihorario
 * @author  Erick
 * @version 1.0
 * @since   2021-09-19
 */
@RestController
public class RetoController {

    @PostMapping(value="api/retoapp/matrices",
            produces="application/json")
    @ResponseBody
    public String createMatriz(@RequestBody int[][] input) {
        Gson gson = new Gson();
        int matrizNueva[][] = new int[0][];

        try {
            matrizNueva = TransformarMatriz.rotar90Grados(input);
            gson.toJson(matrizNueva);

        }catch (NullPointerException e) {
            new NullPointerException(e.toString());
        }
        return gson.toJson(matrizNueva);
    }
}