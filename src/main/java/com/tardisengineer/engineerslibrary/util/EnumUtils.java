package com.tardisengineer.engineerslibrary.util;

import net.minecraft.core.Direction;

public class EnumUtils {

    private EnumUtils() {
    }

    public static final Direction[] DIRECTIONS = Direction.values();
    public static final Direction[] HORIZONTAL_DIRECTIONS = {Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
}
