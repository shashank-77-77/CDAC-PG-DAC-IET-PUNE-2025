import com.exceptions.NegativeSalException;
import com.service.MyService;

public class TestException {

	public static void main(String[] args) {
		MyService ms=new MyService();
		try {
			ms.acceptData();
		}catch(NegativeSalException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
