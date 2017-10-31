package sprite.ConVat;

import enumm.TrangThaiConVat;
import sprite.Chuong.Chuong;
import sprite.Sprite;

/**
 * Created by tranmonglong0611 on 29/10/2017.
 */
public class ConVat extends Sprite{

    TrangThaiConVat trangThai;
    public int timeRemaining;
    public Chuong chuongBelongTo;
    public String animation;

    @Override
    public void onTouchEvent() {

    }

    @Override
    public void onLongTouchEvent() {

    }

    @Override
    public void dragAndDrop() {

    }

    public void updatePosition() {
        // con vat di chuyen trong chuong
    }
}
