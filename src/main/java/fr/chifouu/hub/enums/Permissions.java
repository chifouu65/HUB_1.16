package fr.chifouu.hub.enums;

import org.bukkit.entity.Player;

public enum Permissions {
    FLY("perms.fly"),
    BROADCAST_JOIN("perms.broadcast.join"),
    BYPASS("perms.bypass");

    private String perm;

    Permissions(String perm) {
        this.perm = perm;
    }

    public String getPerm() {
        return this.perm;
    }

    public boolean hasPerm(Player p) {
        return (p.isOp() || p.hasPermission("suplobby.*") || p.hasPermission(this.perm));
    }
}
