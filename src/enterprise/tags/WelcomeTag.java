package enterprise.tags;

import sun.org.mozilla.javascript.internal.ast.TryStatement;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.*;
import java.text.*;

/**
 * Created by Student on 10/19/2015.
 */
public class WelcomeTag extends SimpleTagSupport{

    public void doTag() throws JspException, IOException {
        try {
            Calendar cal = Calendar.getInstance();
            Date time = cal.getTime();

            String string1 = "12:00:00";
            Date time1 = new SimpleDateFormat("HH:mm:ss").parse(string1);
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(time1);

            JspWriter out = getJspContext().getOut();

            if (time.before(calendar1.getTime())) {
                out.println("Good Morning!");
            }else {
                out.println("Good Afternoon!");
            }



        } catch (ParseException ex) {
             ex.printStackTrace();
        }





    }

}
