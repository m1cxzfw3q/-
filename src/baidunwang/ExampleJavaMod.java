package baidunwang;

import arc.math.geom.Rect;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.type.UnitType;
import mindustry.type.unit.TankUnitType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ExampleJavaMod extends Mod {
    public static @EntityDef({Unitc.class, Tankc.class}) UnitType baidunwang1;

    @Override
    public void loadContent(){
        baidunwang1 = new TankUnitType("baidunwang1") {{
            flying = false;
            hitSize = 10f * 8;
            treadPullOffset = 1;
            speed = 3f;
            health = 50000;
            armor = 40f;
            crushDamage = 200f;
            rotateSpeed = 2f;
            constructor = UnitEntity::create;

            float xo = 231f/2f, yo = 231f/2f;
            treadRects = new Rect[]{new Rect(27 - xo, 152 - yo, 56, 73), new Rect(24 - xo, 51 - 9 - yo, 29, 17), new Rect(59 - xo, 18 - 9 - yo, 39, 19)};
        }};
    }


    /** Indicates an entity definition. */
    @Retention(RetentionPolicy.SOURCE)
    public @interface EntityDef{
        /** List of component interfaces */
        Class[] value();
        /** Whether the class is final */
        boolean isFinal() default true;
        /** If true, entities are recycled. */
        boolean pooled() default false;
        /** Whether to serialize (makes the serialize method return this value).
         * If true, this entity is automatically put into save files.
         * If false, no serialization code is generated at all. */
        boolean serialize() default true;
        /** Whether to generate IO code. This is for advanced usage only. */
        boolean genio() default true;
        /** Whether I made a massive mistake by merging two different class branches */
        boolean legacy() default false;
    }
}
