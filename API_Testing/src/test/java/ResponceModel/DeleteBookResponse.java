package ResponceModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteBookResponse {

    @JsonProperty
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
