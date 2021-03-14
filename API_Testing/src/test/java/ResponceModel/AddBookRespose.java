package ResponceModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookRespose {

    @JsonProperty
    private String Msg;

    @JsonProperty
    private String ID;

    public String getId() {
        return ID;
    }

   /* public void setId(String ID) {
        this.ID = ID;
    }*/

    public String getMsg() {
        return Msg;
    }

   /* public void setMsg(String Msg) {
        this.Msg = Msg;
    }*/
}
