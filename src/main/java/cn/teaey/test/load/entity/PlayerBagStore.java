package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerBagStore implements Blobable<Entity.PlayerBagStoreBlob>
{
    private List<PlayerBag> playerBagList = new ArrayList<>();
    @Override
    public Entity.PlayerBagStoreBlob toBlob()
    {
        Entity.PlayerBagStoreBlob.Builder blob = Entity.PlayerBagStoreBlob.newBuilder();
        for (PlayerBag each : playerBagList)
        {
            blob.addPlayerBagBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerBagStoreBlob playerBagStoreBlob)
    {
        for (Entity.PlayerBagBlob each : playerBagStoreBlob.getPlayerBagBlobList())
        {
            PlayerBag playerBag = new PlayerBag();
            playerBag.fromBlob(each);
            playerBagList.add(playerBag);
        }
    }
    public List<PlayerBag> getPlayerBagList()
    {
        return playerBagList;
    }
}
