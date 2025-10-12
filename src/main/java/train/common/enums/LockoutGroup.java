package train.common.enums;

import train.common.utils.lockout.ILockoutGroup;


public enum LockoutGroup implements ILockoutGroup
{
    DEFAULT,
    SPR("932ac07f-59c3-43ec-b11d-a26ea08c77d9"), //TBEA
    SCP("932ac07f-59c3-43ec-b11d-a26ea08c77d9"), //TBEA

    //begin the bida spam of reporting marks
    FNCC("d46213e9-ea09-40e7-9ec9-595903d98e17"), //fox, north coast & cascades
    FMSR("d46213e9-ea09-40e7-9ec9-595903d98e17"), //fox, marble & seaboard ry
    DES("d46213e9-ea09-40e7-9ec9-595903d98e17"), //detroit export system
    //ANE("d46213e9-ea09-40e7-9ec9-595903d98e17"), //avanste northeastern - tbd if i want to lock it or not
    CPV("d46213e9-ea09-40e7-9ec9-595903d98e17"), //carbondale & pine valley
    CNRC("d46213e9-ea09-40e7-9ec9-595903d98e17"), //cedar northern

    //messi
    MTS("8eb7bc43-c2c4-4b45-8329-4c5260c0fbf0"), //Morristown Tenneva & Southern
    LW ("8eb7bc43-c2c4-4b45-8329-4c5260c0fbf0"), //Lisha & Watson


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



