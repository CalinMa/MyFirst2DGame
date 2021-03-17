package CalinMa.Gfx;

import java.awt.image.BufferedImage;

public class Assets {
    // the file sheet.png from Res/textures/ is the sheet from where entities are taken
    private static final int width = 40, height = 40;
    public static BufferedImage  dirt, grass, stone, tree;
    public static BufferedImage[] player_down, player_up, player_left, player_right;
    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("C:\\Users\\LEGION\\Downloads\\PrimulMeuJoc\\Res\\textures\\sheet.png"));
        player_down = new BufferedImage[2];
        player_up = new BufferedImage[2];
        player_left = new BufferedImage[2];
        player_right = new BufferedImage[2];

        player_down[0] = sheet.crop(width , 0, width, height);
        player_down[1] = sheet.crop(width * 2 , 0, width, height);
        player_up[0] = sheet.crop(width * 2, 0, width, height);
        player_up[1] = sheet.crop(width , 0, width, height);
        player_left[0] = sheet.crop(0, height * 2, width, height);
        player_left[1] = sheet.crop(width , height * 2, width, height);
        player_right[0] = sheet.crop(width * 2, 0, width, height);
        player_right[1] = sheet.crop(width , 0, width, height);

        dirt = sheet.crop(width, height, width, height);
        grass = sheet.crop(0, height, width, height);
        stone = sheet.crop(width * 2, height, width, height);
        tree = sheet.crop(0, 0, width, height) ;
    }
}
