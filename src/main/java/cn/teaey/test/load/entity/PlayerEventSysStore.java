package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerEventSysStore implements Blobable<Entity.PlayerEventSysStoreBlob>
{
    private List<PlayerEventSys> playerEventSysList = new ArrayList<>();
    public List<PlayerEventSys> getPlayerEventSysList()
    {
        return playerEventSysList;
    }
    @Override
    public Entity.PlayerEventSysStoreBlob toBlob()
    {
        Entity.PlayerEventSysStoreBlob.Builder blob = Entity.PlayerEventSysStoreBlob.newBuilder();
        for (PlayerEventSys each : playerEventSysList)
        {
            blob.addPlayerEventSysBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerEventSysStoreBlob playerEventSysStoreBlob)
    {
        for (Entity.PlayerEventSysBlob each : playerEventSysStoreBlob.getPlayerEventSysBlobList())
        {
            PlayerEventSys playerEventSys = new PlayerEventSys();
            playerEventSys.fromBlob(each);
            playerEventSysList.add(playerEventSys);
        }
    }
}
