package train.common.commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class tcAdminPerm extends CommandBase
{
    public String getCommandName() {return "tc.admin";}
    public String getCommandUsage(ICommandSender CommandSender) {return "/tcadmin";}
    public int getRequiredPermissionLevel() {return 2;}

    public void processCommand(ICommandSender CommandSender, String[] par2ArrayOfStr) {
        getCommandSenderAsPlayer(CommandSender).addChatMessage(
                new ChatComponentText(
                        "this command exists as a placeholder to allow admin permissions in TC via plugins and mods such as GroupManager and Forge Essentials"));
    }
}
