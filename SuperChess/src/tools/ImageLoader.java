package tools;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageLoader {
    private Map<String, BufferedImage> images;
    private int selectedAsset = 1; // Various assets for the pieces and board

    private final String BLACK_PIECES_PATH = "ressources/black/";
    private final String WHITE_PIECES_PATH = "ressources/white/";

    public ImageLoader() {
        images = new HashMap<>();
        loadImages();
        System.out.println("ImageLoader initialized");
    }

    private void loadImages() {
        try {
            // Load Black Pieces
            images.put("black_pawn", ImageIO.read(new File(BLACK_PIECES_PATH + "pawn" + selectedAsset + ".png")));
            images.put("black_rook", ImageIO.read(new File(BLACK_PIECES_PATH + "rook" + selectedAsset + ".png")));
            images.put("black_knight", ImageIO.read(new File(BLACK_PIECES_PATH + "knight" + selectedAsset + ".png")));
            images.put("black_bishop", ImageIO.read(new File(BLACK_PIECES_PATH + "bishop" + selectedAsset + ".png")));
            images.put("black_queen", ImageIO.read(new File(BLACK_PIECES_PATH + "queen" + selectedAsset + ".png")));
            images.put("black_king", ImageIO.read(new File(BLACK_PIECES_PATH + "king" + selectedAsset + ".png")));

            // Load White Pieces
            images.put("white_pawn", ImageIO.read(new File(WHITE_PIECES_PATH + "pawn" + selectedAsset + ".png")));
            images.put("white_rook", ImageIO.read(new File(WHITE_PIECES_PATH + "rook" + selectedAsset + ".png")));
            images.put("white_knight", ImageIO.read(new File(WHITE_PIECES_PATH + "knight" + selectedAsset + ".png")));
            images.put("white_bishop", ImageIO.read(new File(WHITE_PIECES_PATH + "bishop" + selectedAsset + ".png")));
            images.put("white_queen", ImageIO.read(new File(WHITE_PIECES_PATH + "queen" + selectedAsset + ".png")));
            images.put("white_king", ImageIO.read(new File(WHITE_PIECES_PATH + "king" + selectedAsset + ".png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void resetImages() {
        images.clear();
        loadImages();
    }

    public BufferedImage getImage(String name) {
        return images.get(name);
    }
}
