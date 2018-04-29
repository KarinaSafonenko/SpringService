package com.vpaveldm.controller;

import com.vpaveldm.entity.LocalNetwork;
import com.vpaveldm.db.DBController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LocalNetworkController {

    private static final String MAIN_PAGE = "index";
    private static final String MODEL_NAME = "localNetworks";
    private static final String CHECK_PAGE = "/pages/check";
    private static final String ADD_PAGE = "/pages/add";
    private static final String REMOVE_PAGE = "/pages/delete";
    private static final String COMMAND = "command";
    private static final String UPDATE_PAGE = "/pages/update";
    private DBController controller;

    @Autowired
    public LocalNetworkController(DBController controller) {
        this.controller = controller;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addLocalNetwork() {
        return new ModelAndView(ADD_PAGE, COMMAND, new LocalNetwork());
    }

    @RequestMapping(value = "/addLocalNetwork", method = RequestMethod.POST)
    public ModelAndView addLocalNetwork(@ModelAttribute("localNetworkJSP") LocalNetwork localNetwork, ModelMap modelMap) {
        controller.add(localNetwork);
        return new ModelAndView(MAIN_PAGE);
    }

    @RequestMapping(value = "/change", method = RequestMethod.GET)
    public ModelAndView changeLocalNetwork() {
        return new ModelAndView(UPDATE_PAGE, COMMAND, new LocalNetwork());
    }

    @RequestMapping(value = "/changeLocalNetwork", method = RequestMethod.POST)
    public ModelAndView changeLocalNetwork(@ModelAttribute("localNetworkJSP") LocalNetwork localNetwork) {
        controller.change(localNetwork);
        return new ModelAndView(MAIN_PAGE);
    }

    @RequestMapping(value = "/getLocalNetworks", method = RequestMethod.GET)
    public ModelAndView receiveLocalNetworks() {
        List<LocalNetwork> networks = controller.getNetworks();
        return new ModelAndView(CHECK_PAGE, MODEL_NAME, networks);
    }

    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public ModelAndView removeLocalNetwork() {
        return new ModelAndView(REMOVE_PAGE);
    }

    @RequestMapping(value = "/removeLocalNetwork", method = RequestMethod.POST)
    public ModelAndView removeLocalNetwork(@RequestParam int id) {
        controller.remove(id);
        return new ModelAndView(MAIN_PAGE);
    }

}
