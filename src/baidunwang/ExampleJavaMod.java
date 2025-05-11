package baidunwang;

import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.type.unit.TankUnitType;

public class ExampleJavaMod extends Mod {
    public static TankUnitType baidunwang1;

    @Override
    public void loadContent(){
        baidunwang1 = new TankUnitType("baidunwang1") {{
            hitSize = 20f * 8;
            treadPullOffset = 3;
            speed = 3f;
            health = 50000;
            armor = 40f;
            crushDamage = 200f;
            rotateSpeed = 2f;
            constructor = UnitEntity::create;

            float xo = 231f/2f, yo = 231f/2f;
        }};
    }
}
