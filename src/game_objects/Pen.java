package game_objects;

public class Pen implements IGameObject  {
     boolean visible;

    public Pen(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String whoAmI() {
        return "P";
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
