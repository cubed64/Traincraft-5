package train.common.enums;

/**Enums that cause special rendering to occur
 *
 */
public enum BoxName
{
    cull("cull"),
    lamp("lamp"),
    ditch("ditch"),
    ditch_left("ditch"), // not used for anything special right now but god to document
    ditch_right("ditch"), // not used for anything special right now but god to document
    prime1("prime1"),
    prime2("prime2"),
    prime3("prime3"),
    prime4("prime4"),
    commander("commander"),
    wheel("wheel"); // not used for anything special right now but god to document

    public final String BoxName;

    /**Constructor for BoxName
     *
     * @param boxname
     */
    BoxName(String boxname)
    {
        BoxName = boxname;
    }
}