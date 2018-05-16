package org.portale;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.portale.model.Fornitore;
import org.portale.service.FornitoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FornitoreController {
	
	private FornitoreService fornitoreService;
	
	
	@Autowired(required=true)
	@Qualifier(value="fornitoreService")
	public void setPersonService(FornitoreService fs){
		this.fornitoreService = fs;
	}
	
	@GetMapping("/Suppliers.htm")
	public ModelAndView viewsSuppliers(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		//Gson gson = new Gson();
		List<Fornitore> fornitori = fornitoreService.listaFornitori();
		//String json = gson.toJson(fornitori);

		return new ModelAndView("firstLogin", "lista", fornitori);
	}
	
	@RequestMapping("/wee")
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) 	
	{
		ModelAndView mav =new ModelAndView("firstLogin");
		String testo = "benvenuto";
		mav.addObject("msg",testo);
		//return new ModelAndView("login", "message", message);
		return mav;
	}
	
	
	@RequestMapping(value = "/fornitori", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("fornitore", new Fornitore());
		model.addAttribute("listFornitori", this.fornitoreService.listaFornitori());
		return "fornitore";
	}
	
	//For add and update person both
	@RequestMapping(value= "/fornitore/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("fornitore") Fornitore fornitore)
	{		
		if(fornitore.getVW_BodyRentalVendor_Id() == 0)
		   {			//new person, add it
			this.fornitoreService.addFornitore(fornitore);
		   }
		    else
			    {	//existing person, call update
				this.fornitoreService.updateFornitore(fornitore);
				}
		
		return "redirect:/persons";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.fornitoreService.removeFornitore(id);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.fornitoreService.getFornitoreById(id));
        model.addAttribute("listPersons", this.fornitoreService.listaFornitori());
        return "person";
    }
	
}
