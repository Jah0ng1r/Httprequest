import java.io.Serializable;

public class DeckType implements Serializable {
    public String action;
    public Integer version;

    public DeckType(String action, Integer version) {
        this.action = action;
        this.version = version;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
