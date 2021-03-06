package br.edu.ifba.eunapolis.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifba.eunapolis.model.Marca;
import br.edu.ifba.eunapolis.service.MarcaRegistration;

@Model
public class MarcaController {
	 @Inject
	    private FacesContext facesContext;

	    @Inject
	    private MarcaRegistration marcaRegistration;

	    @Produces
	    @Named
	    private Marca newMarca;

	    @PostConstruct
	    public void initNewMarca() {
	        newMarca = new Marca();
	    }
	    public void register() throws Exception {
	        try {
	            marcaRegistration.register(newMarca);
	            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registered!", "Registration successful");
	            facesContext.addMessage(null, m);
	            initNewMarca();
	        } catch (Exception e) {
	            String errorMessage = getRootErrorMessage(e);
	            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Registration unsuccessful");
	            facesContext.addMessage(null, m);
	        }
	    }

	    private String getRootErrorMessage(Exception e) {
	        // Default to general error message that registration failed.
	        String errorMessage = "Registration failed. See server log for more information";
	        if (e == null) {
	            // This shouldn't happen, but return the default messages
	            return errorMessage;
	        }

	        // Start with the exception and recurse to find the root cause
	        Throwable t = e;
	        while (t != null) {
	            // Get the message from the Throwable class instance
	            errorMessage = t.getLocalizedMessage();
	            t = t.getCause();
	        }
	        // This is the root cause message
	        return errorMessage;
	    }

	}


