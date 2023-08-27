package coordinate.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoordinateInput {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String receiveCoordinates() {
        return readLine();
    }

    private String readLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
