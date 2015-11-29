package controllers;

import java.util.ArrayList;

import models.Anuncio;
import models.dao.GenericDAO;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static ArrayList<Anuncio> anuncios = new ArrayList<Anuncio>();
	private static Form<Anuncio> anuncioForm = Form.form(Anuncio.class);
	private static final GenericDAO dao = new GenericDAO();
	
	@Transactional
    public static Result index() {		
        return ok(views.html.index.render(anuncios));
    }
    
    @Transactional
    public static Result criarAnuncio() {
    	Form<Anuncio> formAnuncio = Form.form(Anuncio.class);
    	
    	Anuncio anuncio = formAnuncio.bindFromRequest().get();
    	
    	anuncios.add(anuncio);
    	
    	return ok(views.html.index.render(anuncios));
    }
    
    //TO DO
    public static Result novoAnuncio() {
    	Form<Anuncio> filledForm = anuncioForm.bindFromRequest();
    	
    	Anuncio anuncio= filledForm.get();
    	dao.persist(anuncio);
    	dao.flush();
    	
    	return redirect(routes.Application.index());
    }
}
