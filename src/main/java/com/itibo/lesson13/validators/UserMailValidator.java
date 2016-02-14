package com.itibo.lesson13.validators;


import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("UserMailValidator")
public class UserMailValidator implements Validator {

    private static final String pattern = "^([a-z0-9#!$%&'\\(\\)*+\\-/=?^_`\\{\\}|~]+)?(\\.\\w+)*(\".*\")?@([a-z])+(\\.[a-z0-9]+)*(:[0-9]+)?$";

    public UserMailValidator() {
    }

    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {

        Pattern pattern = Pattern.compile(UserMailValidator.pattern);

        Matcher matcher = pattern.matcher(value.toString());

        if (!matcher.find()) {
            FacesMessage msg;
            if (value.toString().isEmpty()) {
                msg = new FacesMessage("Please, input mail");
            } else {
                msg = new FacesMessage("Mail '" + value.toString() + "' is not correct.");
            }
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}