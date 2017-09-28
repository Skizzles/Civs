package org.redcastlemedia.multitallented.civs.regions;

import org.bukkit.Location;

import java.util.HashSet;
import java.util.UUID;

public class Region {

    private final String type;
    private final HashSet<UUID> members;
    private final HashSet<UUID> owners;
    private final Location location;
    private final int radiusXP;
    private final int radiusZP;
    private final int radiusXN;
    private final int radiusZN;
    private final int radiusYP;
    private final int radiusYN;

    public Region(String type, HashSet<UUID> owners, HashSet<UUID> members, Location location, int[] buildRadius) {
        this.type = type;
        this.owners = owners;
        this.members = members;
        this.location = location;
        radiusXP = buildRadius[0];
        radiusZP = buildRadius[1];
        radiusXN = buildRadius[2];
        radiusZN = buildRadius[3];
        radiusYP = buildRadius[4];
        radiusYN = buildRadius[5];
    }
    public String getType() {
        return type;
    }
    public HashSet<UUID> getOwners() {
        return owners;
    }
    public HashSet<UUID> getMembers() {
        return members;
    }
    public Location getLocation() {
        return location;
    }
    public int getRadiusXP() {
        return radiusXP;
    }
    public int getRadiusZP() {
        return radiusZP;
    }
    public int getRadiusXN() {
        return radiusXN;
    }
    public int getRadiusZN() {
        return radiusZN;
    }
    public int getRadiusYP() {
        return radiusYP;
    }
    public int getRadiusYN() {
        return radiusYN;
    }
}
