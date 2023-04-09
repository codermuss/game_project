package game_objects;

public class Unidentified implements IGameObject {
     boolean visible;

    public Unidentified(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String whoAmI() {
       return "U";
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
