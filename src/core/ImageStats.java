package core;


import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.opencv.core.Core;
import static org.opencv.core.Core.mean;
import static org.opencv.core.Core.minMaxLoc;
import static org.opencv.core.Core.split;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;

public class ImageStats {
    
    private static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    

    private final int BLUE = 0;
    private final int GREEN = 1;
    private final int RED = 2;

    public final int[] RGB = {RED, GREEN, BLUE};

    private int[] max = new int[3];
    private int[] min = new int[3];
    private int[] average = new int[3];
    
     static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public int[] getMax() {
        return max;
    }

    public int[] getMin() {
        return min;
    }

    public int[] getAverage() {
        return average;
    }
    
    
    public static Mat bufferedImageToMat(BufferedImage in){
          Mat out;
          byte[] data;
          int r, g, b;

          if(in.getType() == BufferedImage.TYPE_INT_RGB)
          {
              out = new Mat(240, 320, CvType.CV_8UC3);
              data = new byte[320 * 240 * (int)out.elemSize()];
              int[] dataBuff = in.getRGB(0, 0, 320, 240, null, 0, 320);
              for(int i = 0; i < dataBuff.length; i++)
              {
                  data[i*3] = (byte) ((dataBuff[i] >> 16) & 0xFF);
                  data[i*3 + 1] = (byte) ((dataBuff[i] >> 8) & 0xFF);
                  data[i*3 + 2] = (byte) ((dataBuff[i] >> 0) & 0xFF);
              }
          }
          else
          {
              out = new Mat(240, 320, CvType.CV_8UC1);
              data = new byte[320 * 240 * (int)out.elemSize()];
              int[] dataBuff = in.getRGB(0, 0, 320, 240, null, 0, 320);
              for(int i = 0; i < dataBuff.length; i++)
              {
                r = (byte) ((dataBuff[i] >> 16) & 0xFF);
                g = (byte) ((dataBuff[i] >> 8) & 0xFF);
                b = (byte) ((dataBuff[i] >> 0) & 0xFF);
                data[i] = (byte)((0.21 * r) + (0.71 * g) + (0.07 * b)); //luminosity
              }
           }
           out.put(0, 0, data);
           return out;
     } 
    
      

    public void calculateStats(Mat subImage) {

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