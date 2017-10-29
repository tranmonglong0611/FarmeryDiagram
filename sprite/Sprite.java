package sprite;

import java.util.HashMap;

/**
 * Created by tranmonglong0611 on 28/10/2017.
 */

/// nha` ruong chuong ga...
public abstract class Sprite {


    int width;              //logic
    int height;
    int id;
    public String image;
    NhaKho nhaKho;
    KhoLuongThuc khoLuongThuc;


    HashMap<Integer, Integer> logicPosition;
    HashMap<Float, Float> physicPosition;



    //show popUp by calling the PopUp.method() va chuyen tham so vao
    public abstract void onTouchEvent();

    public abstract void onLongTouchEvent();

    public abstract void dragAndDrop();







}
