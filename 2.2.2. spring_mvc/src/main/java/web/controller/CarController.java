package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count") int id, Model model) {
        List cars1 = new ArrayList();

       if(id >= 5) {
           model.addAttribute("carslist", carService.getSomeCars());
       }else {
           for (int x = 1, y = 0; x <= id; x++, y++) {
               cars1.add(carService.getSomeCars().get(y));
           }
           model.addAttribute("carslist", cars1);
       }

         return "cars";
    }
}



//убрать переменную лист машин из контроллера.
//заинжектить сервис в контроллер. доставать из него нужное количество машин и отправлять на страницу
