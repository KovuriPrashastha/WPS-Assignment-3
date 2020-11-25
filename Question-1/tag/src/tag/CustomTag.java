package tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTag extends TagSupport{
	private String name;  
    private String designation;
    
	public void setName(String name) {  
	    this.name = name;  
	} 
	public void setDesignation(String designation) {
		this.designation = designation;
	}
    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter writer = pageContext.getOut();
            writer.print("<div align='center' style='border-style: inset;'>");
            writer.print("<h4>Name : "+name+"<br>");
            writer.print("<h4>Designation : "+designation+"<br>");
            writer.print("<h4>Vasavi College Of Engineering, Hyderabad</h4><br>");
            writer.print("</div>");
        }catch (IOException ex) {
        	System.out.println(ex);
        }
        return SKIP_BODY;
    }
}