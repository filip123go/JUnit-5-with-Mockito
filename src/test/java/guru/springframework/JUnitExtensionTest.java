package guru.springframework;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {

	@Mock
	Map<String , Object> mapMock;


	@Test
	void testMock(){
		mapMock.put("KeyValue","foo");
	}


}
