package train.common.utils.lockout;

public interface ILockoutGroup
{
    String name();

    /**
     * UUID AS A STRING
     * @return
     */
    String groupUUIDOwner();
}
