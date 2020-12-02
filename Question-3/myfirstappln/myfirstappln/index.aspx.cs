using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
//using myfirstappln.ServiceReference1;
using myfirstappln.ServiceReference3;
namespace myfirstappln
{
    public partial class index : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String enteredid = TextBox3.Text;
            Service1Client client = new Service1Client();
            String name = client.username(enteredid);
            greet.Text = name;
        }
    }
}