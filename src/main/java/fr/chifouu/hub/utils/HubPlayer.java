package fr.chifouu.hub.utils;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.*;

public class HubPlayer {
        public static Map<UUID, HubPlayer> SupPlayer = new HashMap<>();

        private UUID uuid;

        private Player player;


        private PlayerInventory playerinventory;


        public HubPlayer(Player player) {
            this.playerinventory = new PlayerInventory() {
                @Override
                public ItemStack[] getArmorContents() {
                    return new ItemStack[0];
                }

                @Override
                public ItemStack[] getExtraContents() {
                    return new ItemStack[0];
                }

                @Override
                public ItemStack getHelmet() {
                    return null;
                }

                @Override
                public ItemStack getChestplate() {
                    return null;
                }

                @Override
                public ItemStack getLeggings() {
                    return null;
                }

                @Override
                public ItemStack getBoots() {
                    return null;
                }

                @Override
                public void setItem(int index, ItemStack item) {

                }

                @Override
                public void setItem(EquipmentSlot slot, ItemStack item) {

                }

                @Override
                public ItemStack getItem(EquipmentSlot slot) {
                    return null;
                }

                @Override
                public void setArmorContents(ItemStack[] items) {

                }

                @Override
                public void setExtraContents(ItemStack[] items) {

                }

                @Override
                public void setHelmet(ItemStack helmet) {

                }

                @Override
                public void setChestplate(ItemStack chestplate) {

                }

                @Override
                public void setLeggings(ItemStack leggings) {

                }

                @Override
                public void setBoots(ItemStack boots) {

                }

                @Override
                public ItemStack getItemInMainHand() {
                    return null;
                }

                @Override
                public void setItemInMainHand(ItemStack item) {

                }

                @Override
                public ItemStack getItemInOffHand() {
                    return null;
                }

                @Override
                public void setItemInOffHand(ItemStack item) {

                }

                @Override
                public ItemStack getItemInHand() {
                    return null;
                }

                @Override
                public void setItemInHand(ItemStack stack) {

                }

                @Override
                public int getHeldItemSlot() {
                    return 0;
                }

                @Override
                public void setHeldItemSlot(int slot) {

                }

                @Override
                public HumanEntity getHolder() {
                    return null;
                }

                @Override
                public int getSize() {
                    return 0;
                }

                @Override
                public int getMaxStackSize() {
                    return 0;
                }

                @Override
                public void setMaxStackSize(int size) {

                }

                @Override
                public ItemStack getItem(int index) {
                    return null;
                }

                @Override
                public HashMap<Integer, ItemStack> addItem(ItemStack... items) throws IllegalArgumentException {
                    return null;
                }

                @Override
                public HashMap<Integer, ItemStack> removeItem(ItemStack... items) throws IllegalArgumentException {
                    return null;
                }

                @Override
                public ItemStack[] getContents() {
                    return new ItemStack[0];
                }

                @Override
                public void setContents(ItemStack[] items) throws IllegalArgumentException {

                }

                @Override
                public ItemStack[] getStorageContents() {
                    return new ItemStack[0];
                }

                @Override
                public void setStorageContents(ItemStack[] items) throws IllegalArgumentException {

                }

                @Override
                public boolean contains(Material material) throws IllegalArgumentException {
                    return false;
                }

                @Override
                public boolean contains(ItemStack item) {
                    return false;
                }

                @Override
                public boolean contains(Material material, int amount) throws IllegalArgumentException {
                    return false;
                }

                @Override
                public boolean contains(ItemStack item, int amount) {
                    return false;
                }

                @Override
                public boolean containsAtLeast(ItemStack item, int amount) {
                    return false;
                }

                @Override
                public HashMap<Integer, ? extends ItemStack> all(Material material) throws IllegalArgumentException {
                    return null;
                }

                @Override
                public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
                    return null;
                }

                @Override
                public int first(Material material) throws IllegalArgumentException {
                    return 0;
                }

                @Override
                public int first(ItemStack item) {
                    return 0;
                }

                @Override
                public int firstEmpty() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public void remove(Material material) throws IllegalArgumentException {

                }

                @Override
                public void remove(ItemStack item) {

                }

                @Override
                public void clear(int index) {

                }

                @Override
                public void clear() {

                }

                @Override
                public List<HumanEntity> getViewers() {
                    return null;
                }

                @Override
                public InventoryType getType() {
                    return null;
                }

                @Override
                public ListIterator<ItemStack> iterator() {
                    return null;
                }

                @Override
                public ListIterator<ItemStack> iterator(int index) {
                    return null;
                }

                @Override
                public Location getLocation() {
                    return null;
                }
            };
            this.uuid = player.getUniqueId();
            this.player = player;
            HubPlayer.put(player.getUniqueId(), this);
        }

    private static void put(UUID uniqueId, HubPlayer hubPlayer) {
    }

    public HubPlayer(UUID uuid) {

            this.playerinventory = new PlayerInventory() {
                @Override
                public ItemStack[] getArmorContents() {
                    return new ItemStack[0];
                }

                @Override
                public ItemStack[] getExtraContents() {
                    return new ItemStack[0];
                }

                @Override
                public ItemStack getHelmet() {
                    return null;
                }

                @Override
                public ItemStack getChestplate() {
                    return null;
                }

                @Override
                public ItemStack getLeggings() {
                    return null;
                }

                @Override
                public ItemStack getBoots() {
                    return null;
                }

                @Override
                public void setItem(int index, ItemStack item) {

                }

                @Override
                public void setItem(EquipmentSlot slot, ItemStack item) {

                }

                @Override
                public ItemStack getItem(EquipmentSlot slot) {
                    return null;
                }

                @Override
                public void setArmorContents(ItemStack[] items) {

                }

                @Override
                public void setExtraContents(ItemStack[] items) {

                }

                @Override
                public void setHelmet(ItemStack helmet) {

                }

                @Override
                public void setChestplate(ItemStack chestplate) {

                }

                @Override
                public void setLeggings(ItemStack leggings) {

                }

                @Override
                public void setBoots(ItemStack boots) {

                }

                @Override
                public ItemStack getItemInMainHand() {
                    return null;
                }

                @Override
                public void setItemInMainHand(ItemStack item) {

                }

                @Override
                public ItemStack getItemInOffHand() {
                    return null;
                }

                @Override
                public void setItemInOffHand(ItemStack item) {

                }

                @Override
                public ItemStack getItemInHand() {
                    return null;
                }

                @Override
                public void setItemInHand(ItemStack stack) {

                }

                @Override
                public int getHeldItemSlot() {
                    return 0;
                }

                @Override
                public void setHeldItemSlot(int slot) {

                }

                @Override
                public HumanEntity getHolder() {
                    return null;
                }

                @Override
                public int getSize() {
                    return 0;
                }

                @Override
                public int getMaxStackSize() {
                    return 0;
                }

                @Override
                public void setMaxStackSize(int size) {

                }

                @Override
                public ItemStack getItem(int index) {
                    return null;
                }

                @Override
                public HashMap<Integer, ItemStack> addItem(ItemStack... items) throws IllegalArgumentException {
                    return null;
                }

                @Override
                public HashMap<Integer, ItemStack> removeItem(ItemStack... items) throws IllegalArgumentException {
                    return null;
                }

                @Override
                public ItemStack[] getContents() {
                    return new ItemStack[0];
                }

                @Override
                public void setContents(ItemStack[] items) throws IllegalArgumentException {

                }

                @Override
                public ItemStack[] getStorageContents() {
                    return new ItemStack[0];
                }

                @Override
                public void setStorageContents(ItemStack[] items) throws IllegalArgumentException {

                }

                @Override
                public boolean contains(Material material) throws IllegalArgumentException {
                    return false;
                }

                @Override
                public boolean contains(ItemStack item) {
                    return false;
                }

                @Override
                public boolean contains(Material material, int amount) throws IllegalArgumentException {
                    return false;
                }

                @Override
                public boolean contains(ItemStack item, int amount) {
                    return false;
                }

                @Override
                public boolean containsAtLeast(ItemStack item, int amount) {
                    return false;
                }

                @Override
                public HashMap<Integer, ? extends ItemStack> all(Material material) throws IllegalArgumentException {
                    return null;
                }

                @Override
                public HashMap<Integer, ? extends ItemStack> all(ItemStack item) {
                    return null;
                }

                @Override
                public int first(Material material) throws IllegalArgumentException {
                    return 0;
                }

                @Override
                public int first(ItemStack item) {
                    return 0;
                }

                @Override
                public int firstEmpty() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public void remove(Material material) throws IllegalArgumentException {

                }

                @Override
                public void remove(ItemStack item) {

                }

                @Override
                public void clear(int index) {

                }

                @Override
                public void clear() {

                }

                @Override
                public List<HumanEntity> getViewers() {
                    return null;
                }

                @Override
                public InventoryType getType() {
                    return null;
                }

                @Override
                public ListIterator<ItemStack> iterator() {
                    return null;
                }

                @Override
                public ListIterator<ItemStack> iterator(int index) {
                    return null;
                }

                @Override
                public Location getLocation() {
                    return null;
                }
            };
            this.uuid = uuid;
            this.player = null;
            HubPlayer.put(uuid, this);
        }


        public static HubPlayer getHubPlayer(Player player) {
            HubPlayer hubPlayer = HubPlayer.getHubPlayer(player.getUniqueId());
            if (hubPlayer == null)
                return new HubPlayer(player);
            hubPlayer.equals(player);
            return hubPlayer;
        }

        public static HubPlayer getHubPlayer(UUID uuid) {
            HubPlayer hubPlayer = HubPlayer.getHubPlayer(uuid);
            if (hubPlayer == null)
                return new HubPlayer(uuid);
            return hubPlayer;
        }
    }


