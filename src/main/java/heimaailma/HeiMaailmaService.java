package heimaailma;

import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class HeiMaailmaService {

    // käytetyt oliot

    public void testaaMua() throws IOException {
    	Runtime.getRuntime().exec("cmd python C:\\Users\\Quantum\\new.py");
    }
}