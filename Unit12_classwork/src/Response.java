import org.omg.CORBA.Request;

public class Response {
	public Response processRequest(Request request) {
	    if (request.getUser() == null) {
	      Response response = new Response();
	      response.setIsInvalid();
	      return response;
	    }
	    String user = request.getUser();
	    if (user.equals("ADMIN")) {
	      return processAsAdmin(request);
	    } else {
	      return processAsUser(request);
	    }
	  }

}
