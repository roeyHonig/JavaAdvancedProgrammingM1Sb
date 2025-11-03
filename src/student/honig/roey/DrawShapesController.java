package student.honig.roey;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawShapesController {
    @FXML
    private Canvas drawingCanvas;

    private void drawRec() {
        // Get the GraphicsContext for drawing
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();

        // Clear the canvas
        gc.clearRect(0, 0, drawingCanvas.getWidth(), drawingCanvas.getHeight());

        // Draw a rectangle
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(50, 50, 200, 100);

        // Draw a circle
        gc.setFill(Color.CORAL);
        gc.fillOval(300, 100, 100, 100);

        // Draw a line
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(3);
        gc.strokeLine(50, 200, 400, 200);
    }
}
