package sodoku.userinterface;

import javafx.scene.control.TextField;

public class SodokuTextField extends TextField {
    private final int x;
    private final int y;

    public SodokuTextField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    @Override
    public void replaceText(int i, int i1, String s){
        if(!s.matches("[0-9]")){
            super.replaceText(i, i1, s);
        }
    }

    @Override
    public void replaceSelection(String s){
        if(!s.matches("[0-9]")){
            super.replaceSelection(s);
        }
    }
}
