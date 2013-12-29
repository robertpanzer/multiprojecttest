package foo.bar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ServiceLoader;

public class ServiceTest {

	@Test
	public void test() {
		IService impl = ServiceLoader.load(IService.class).iterator().next();
		assertNotNull(impl);
	}
}