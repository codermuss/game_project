package game_objects;

public class Hat implements IGameObject {
   
     boolean visible;
    public Hat(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String whoAmI() {
        return "H";
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
