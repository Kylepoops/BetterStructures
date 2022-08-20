package com.magmaguy.betterstructures.util;

import org.bukkit.Chunk;
import org.bukkit.Location;

public class ChunkLocationChecker {
    private ChunkLocationChecker() {
    }

    /*
    Checks if a location is in a given chunk
     */
    public static boolean chunkLocationCheck(Location location, Chunk chunk) {
        if (!chunk.getWorld().equals(location.getWorld())) return false;
        double chunkX = chunk.getX() * 16;
        double locationX = location.getX();
        double chunkZ = chunk.getZ() * 16;
        double locationZ = location.getZ();
        if (!(chunkX <= locationX && chunkX + 16 >= locationX))
            return false;

        return chunkZ <= locationZ && chunkZ + 16 >= locationZ;
    }

    /*
    Checks if a given location is loaded
     */
    public static boolean locationIsLoaded(Location location) {
        return location != null && location.getWorld() != null &&
                location.getWorld().isChunkLoaded(location.getBlock().getX() >> 4, location.getBlock().getZ() >> 4);
    }

}

