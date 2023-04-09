package game_objects;

public class Ball implements IGameObject {
     boolean visible;

    public Ball(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String whoAmI() {
        return "B";
    }

    @Override
    public boolean getVisible() {
        return this.visible;
    }

    @Override
    public void setVisible(boolean parameter) {
        this.visible=parameter;
    }


    
}
