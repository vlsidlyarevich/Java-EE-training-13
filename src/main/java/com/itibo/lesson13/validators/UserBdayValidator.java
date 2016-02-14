package com.itibo.lesson13.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@FacesValidator("UserBdayValidator")
public class UserBdayValidator implements Validator {


    public UserBdayValidator() {
    }

    public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidatorException {

        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = formatter.parse(value.toString());
        } catch (ParseException e) {

            FacesMessage msg;

            if (value.toString().isEmpty()) {
                msg = new FacesMessage("Please, input birth date in dd-MM-yyyy format");
            } else {
                msg = new FacesMessage("'"+value.toString()+"'"+" is not correct birth date");
            }

            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}