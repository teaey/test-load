package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerMsgStore implements Blobable<Entity.PlayerMsgStoreBlob>
{
    private List<PlayerMsg> playerMsgList = new ArrayList<>();
    @Override
    public Entity.PlayerMsgStoreBlob toBlob()
    {
        Entity.PlayerMsgStoreBlob.Builder blob = Entity.PlayerMsgStoreBlob.newBuilder();
        for (PlayerMsg each : playerMsgList)
        {
            blob.addPlayerMsgBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerMsgStoreBlob playerMsgStoreBlob)
    {
        for (Entity.PlayerMsgBlob each : playerMsgStoreBlob.getPlayerMsgBlobList())
        {
            PlayerMsg playerMsg = new PlayerMsg();
            playerMsg.fromBlob(each);
            playerMsgList.add(playerMsg);
        }
    }
    public List<PlayerMsg> getPlayerMsgList()
    {
        return playerMsgList;
    }
}
