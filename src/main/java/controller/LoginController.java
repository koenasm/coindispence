package controller;

import authentication.AuthenticationFacade;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@ManagedBean(name = "login",eager = true)
@RequestScoped
public class LoginController {

    private static final String INCORRECT_USER_NAME_AND_PASSWORD = "The username or password is incorrect";
   public static final String CAPTURE_DENOMINATION_SCREEN = "capture_denomination";
    public static final String LOGIN_SCREEN = "login";
    private String userName;
    private String password;


    @EJB
    private AuthenticationFacade authenticationFacade;

    @Inject
    protected transient FacesContext facesContext;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String authenticate(){

        if(authenticationFacade.authenticate(userName,password)){
            return CAPTURE_DENOMINATION_SCREEN;
        }else {
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, INCORRECT_USER_NAME_AND_PASSWORD, null));
            return LOGIN_SCREEN;
        }


    }

}