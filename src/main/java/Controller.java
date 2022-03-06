
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField a_editable;

    @FXML
    private Button addition_choice;

    @FXML
    private TextField b_editable;

    @FXML
    private Text result;

    @FXML
    private Button subtraction_choice;

    @FXML
    void add(MouseEvent event) {
        int a;
        int b;
        int r;
        a=Integer.parseInt(a_editable.getText());
        b=Integer.parseInt(b_editable.getText());
       r = a+b;
                result.setText(String.valueOf(r));
                System.out.println(result.getText());
    }

    @FXML
    void subtract(MouseEvent event) {
        int a;
        int b;
        int r;
        a=Integer.parseInt(a_editable.getText());
        b=Integer.parseInt(b_editable.getText());
        r = a-b;
        result.setText(String.valueOf(r));
        System.out.println(result.getText());
    }

}
