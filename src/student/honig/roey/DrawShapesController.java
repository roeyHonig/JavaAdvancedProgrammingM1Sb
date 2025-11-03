package student.honig.roey;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class DrawShapesController {
    @FXML
    private Canvas drawShapesCanvas;
    @FXML
    private Button drawShapesButton;
    @FXML
    private void drawShapesButtonPressed() {
        // Get the GraphicsContext for drawing
        GraphicsContext gc = drawShapesCanvas.getGraphicsContext2D();

        // Clear the canvas
        gc.clearRect(0, 0, drawShapesCanvas.getWidth(), drawShapesCanvas.getHeight());

        // Draw a rectangle
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(50, 50, 200, 100);
/*
        // Draw a circle
        gc.setFill(Color.CORAL);
        gc.fillOval(300, 100, 100, 100);

        // Draw a line
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeLine(50, 200, 400, 200);*/
    }
}
