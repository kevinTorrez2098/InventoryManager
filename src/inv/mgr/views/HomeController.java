package inv.mgr.views;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

public class HomeController extends FXController {
    @FXML
    private JFXButton demandaBtn;

    @FXML
    private JFXButton mrpBtn;

    @FXML
    private JFXButton addplanBtn;

    public void handleDemanda(){
        this.mainApp.showDemand();
    }

}
