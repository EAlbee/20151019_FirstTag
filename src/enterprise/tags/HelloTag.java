package enterprise.tags;

import java.io.IOException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.*;
/**
 * Created by Student on 10/19/2015.
 */
public class HelloTag extends SimpleTagSupport{

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.println("Hello Custom Tag!");
    }

}
