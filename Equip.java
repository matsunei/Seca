class Equip
{
    private String weapon;;
    private boolean hasWeapon;
    public Equip()
    {
        weapon = null;
        hasWeapon = false;
    }
    public Equip(String weapon, boolean hasWeapon)
    {
        this.weapon = weapon;
        this.hasWeapon = hasWeapon;
    }
    public String getWeapon()
    {
        return weapon;
    }
    public boolean hasWeapon()
    {
        return hasWeapon;
    }
   
}// end Equip class
