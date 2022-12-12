import java.io.Serializable;
import java.util.List;

public class Deck implements Serializable {

    public List<String> result;
    public boolean error;

    public Deck() {
    }

    public Deck(List<String> result, boolean error) {
        this.result = result;
        this.error = error;
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
