package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    List<Car> listCars;

    @GetMapping("/cars")
    public String printCar(@RequestParam("count") int id, Model model) {
        List<Car> listIdCars = new ArrayList<>();
        for(int x = 1, y = 0; x <= id;x++,y++){
            listIdCars.add(listCars.get(y));
        }
        model.addAttribute("carslist", listIdCars);

        return "cars";
    }
}

