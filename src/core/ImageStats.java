package core;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import org.opencv.core.Core;
import static org.opencv.core.Core.mean;
import static org.opencv.core.Core.minMaxLoc;
import static org.opencv.core.Core.split;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;

public class ImageStats {

    private final int BLUE = 0;
    private final int GREEN = 1;
    private final int RED = 2;

    private final int[] RGB = {RED, GREEN, BLUE};

    private int[] max = new int[3];
    private int[] min = new int[3];
    private int[] average = new int[3];

    public int[] getMax() {
        return max;
    }

    public int[] getMin() {
        return min;
    }

    public int[] getAverage() {
        return average;
    }

    public void calculaEstadisticas(Mat imagenColor, Point esqSupIzda,
                                    Dimension dimVista) {

        // crea la subimagen correspondiente al viewport
        Mat subImage = new Mat(imagenColor, new Rect(esqSupIzda.x, esqSupIzda.y,
                dimVista.width, dimVista.height));

        // separa los tres canales de la subimagen BGR
        ArrayList<Mat> rgb = new ArrayList<>();
        split(subImage, rgb);

        // estadisticas 
        ImageStats res = new ImageStats();

        for (int c : res.RGB) {
            // obtiene el máximo y mínimo del canal c de la subimagen
            Core.MinMaxLocResult minmax = minMaxLoc(rgb.get(c));
            // calcula el premodio del canal c de la subimagen
            Scalar mean = mean(rgb.get(c));

            this.max[c] = (int) minmax.maxVal;
            this.min[c] = (int) minmax.minVal;
            this.average[c] = (int) mean.val[0];
        }
    }

}