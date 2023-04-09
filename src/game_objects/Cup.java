package game_objects;

public class Cup implements IGameObject {
    boolean visible;

    public Cup(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String whoAmI() {
        return "C";
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
