import javafx.scene.input.TouchEvent;
import sprite.KhoLuongThuc;
import sprite.NhaKho;
import sprite.Sprite;

import java.util.List;

/**
 * Created by tranmonglong0611 on 28/10/2017.
 */
public class Map {

    float width;
    float height;
    int numberOfSprites;                    // used to generate id for new sprite()
    NhaKho nhaKho;
    KhoLuongThuc khoLuongThuc;
    int level;



    List<Sprite> listSprite;


    public Map() {
        //new sprite.NhaKho() and new sprite.KhoLuongThuc();
    }

    public void onOneTouchEvent(TouchEvent event) {
        //get the sprite.Sprite at that position and
        // sprite.onTouchEvent();
    }

    public void onTwoTouchEvent(TouchEvent event) {
        // zoom in zoom out
    }

    public void xepSprite(Sprite sprite, int xLogic, int yLogic) {
        //xep sprite vao dia chi logic x y
    }


    public Sprite getSpriteFromPosition(int xLogic, int yLogic) {
        //return null if there is nothing at that logic position
        return null;
    }

    public int[] getLogicPositionFromPhysical(int xPhysical, int yPhysical) {
        return new int[]{0, 0};
    }



    public void update() {
        //for(int i = 0; i < sprite.length; i++)
        //  sprite.update();
        //ve lai toan bo map. Cap nhat lai position moi cho sprite va ve lai cac vat trong sprite.(ga` lon)

    }

}
