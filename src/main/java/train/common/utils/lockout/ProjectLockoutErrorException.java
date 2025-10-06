package train.common.utils.lockout;

import net.minecraft.command.CommandException;

public class ProjectLockoutErrorException extends CommandException
{
    public ProjectLockoutErrorException(String p_i1359_1_, Object... p_i1359_2_)
    {
        super("Lockout: " + p_i1359_1_, new Object[0]);
    }
}
