package com.esliceu.dwes.xavi.mvc.controller;

import com.esliceu.dwes.xavi.mvc.model.Modelo;
import com.esliceu.dwes.xavi.mvc.model.SubModelo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Xavi Torrens
 */
@Controller
@RequestMapping("/el-test")
public class ELController {

    @RequestMapping(method = RequestMethod.GET)
    public String eltest(ModelMap modelMap){

        modelMap.addAttribute("modelo",createModelo("Xavi"));

        return "/el-test/el";

    }

    @RequestMapping(value = "/mandview/xavi", method = RequestMethod.GET)
    public ModelAndView hello2() {


        ModelAndView model = new ModelAndView();
        model.setViewName("/el-test/mandview");

        model.addObject("modelo", createModelo("TETE"));

        return model;

    }

    @RequestMapping(value = "/mandview/{name}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {


        ModelAndView model = new ModelAndView();
        model.setViewName("/el-test/mandview");

        model.addObject("modelo", createModelo(name));

        return model;

    }

    /**
     * Creates a <tt>Modelo</tt> POJO
     *
     * @return A <tt>Modelo</tt> POJO
     */
    private Modelo createModelo(String name){
        Modelo modelo = new Modelo();
        modelo.setProperty(new SubModelo());
        modelo.getProperty().setSubProperty("Hola " + name);

        return modelo;
    }

}
