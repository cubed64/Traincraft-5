package train.common.enums;

import train.common.utils.lockout.ILockoutGroup;


public enum LockoutGroup implements ILockoutGroup
{
    DEFAULT,
    SPR("932ac07f-59c3-43ec-b11d-a26ea08c77d9"), //TBEA
    SCP("932ac07f-59c3-43ec-b11d-a26ea08c77d9"), //TBEA
    FNCC("d46213e9-ea09-40e7-9ec9-595903d98e17"), //BIDA
    JCTransit()
    ;

    /**
     * When a value is here it is impossible to change the group owner
     * without changing it here. This also has the affect of no matter
     * where you run this you will always be the owner.
     */
    final String GroupDefaultUUIDOwner;
    
    LockoutGroup()
    {
        GroupDefaultUUIDOwner = "SYSTEM";
    }
    
    LockoutGroup(String groupDefaultUUIDOwner)
    {
        GroupDefaultUUIDOwner = groupDefaultUUIDOwner;
    }

    @Override
    public String groupUUIDOwner()
    {
        return GroupDefaultUUIDOwner;
    }
}



