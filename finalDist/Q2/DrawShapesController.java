import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.util.Random;

public class DrawShapesController {
    @FXML
    private Canvas drawShapesCanvas;
    @FXML
    private Button drawShapesButton;
    @FXML
    private void drawShapesButtonPressed() {
        // Get the GraphicsContext for drawing
        GraphicsContext gc = drawShapesCanvas.getGraphicsContext2D();
        // Get the canvas width and height
        double canvasWidth = drawShapesCanvas.getWidth();
        double canvasHeight = drawShapesCanvas.getHeight();
        // Clear the canvas
        gc.clearRect(0, 0, drawShapesCanvas.getWidth(), drawShapesCanvas.getHeight());

        for (int i = 0; i < 10; i++) {
            long choise = getRandomIntInRange(0,2);
            if (choise == 0) {
                drawARandomRectangle(gc, canvasWidth, canvasHeight);
            } else if (choise == 1) {
                drawARandomElipse(gc, canvasWidth, canvasHeight);
            } else {
                drawARandomLine(gc, canvasWidth, canvasHeight);
            }
        }
    }

    private void drawARandomRectangle(GraphicsContext gc, double canvasWidth, double canvasHeight) {
        double rectWidth = getRandomNumberInRange(1, canvasWidth / 4);
        double rectHeight = getRandomNumberInRange(1, canvasHeight / 4);
        double x = getRandomNumberInRange(0, canvasWidth-rectWidth);
        double y = getRandomNumberInRange(0, canvasHeight-rectHeight);
        Color randomColor = getRandomColor();
        gc.setFill(randomColor);
        gc.fillRect(x, y, rectWidth, rectHeight);
    }

    private void drawARandomElipse(GraphicsContext gc, double canvasWidth, double canvasHeight) {
        double elipWidth = getRandomNumberInRange(1, canvasWidth / 4);
        double elipHeight = getRandomNumberInRange(1, canvasHeight / 4);
        double x = getRandomNumberInRange(0, canvasWidth-elipWidth);
        double y = getRandomNumberInRange(0, canvasHeight-elipHeight);
        Color randomColor = getRandomColor();
        gc.setFill(randomColor);
        gc.fillOval(x, y, elipWidth, elipHeight);
    }

    private void drawARandomLine(GraphicsContext gc, double canvasWidth, double canvasHeight) {
        double lineBoxWidth = getRandomNumberInRange(1, canvasWidth / 4);
        double lineBoxHeight = getRandomNumberInRange(1, canvasHeight / 4);
        double x = getRandomNumberInRange(0, canvasWidth-lineBoxWidth);
        double y = getRandomNumberInRange(0, canvasHeight-lineBoxHeight);
        Color randomColor = getRandomColor();
        gc.setStroke(randomColor);
        gc.strokeLine(x, y, (x+lineBoxWidth), (y+lineBoxHeight));
    }

    private Color getRandomColor() {
        Random rand = new Random();
        double r = rand.nextDouble();  // Random value between 0.0 and 1.0
        double g = rand.nextDouble();
        double b = rand.nextDouble();
        return new Color(r, g, b, 1.0);
    }

    private double getRandomNumberInRange(double min, double max) {
        Random rand = new Random();
        return min + (max - min) * rand.nextDouble();
    }

    private int getRandomIntInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

}
