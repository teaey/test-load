package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerGuajiStore implements Blobable<Entity.PlayerGuajiStoreBlob>
{
    private List<PlayerGuaji> playerGuajiList = new ArrayList<>();
    @Override
    public Entity.PlayerGuajiStoreBlob toBlob()
    {
        Entity.PlayerGuajiStoreBlob.Builder blob = Entity.PlayerGuajiStoreBlob.newBuilder();
        for (PlayerGuaji each : playerGuajiList)
        {
            blob.addPlayerGuajiBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerGuajiStoreBlob playerGuajiStoreBlob)
    {
        for (Entity.PlayerGuajiBlob each : playerGuajiStoreBlob.getPlayerGuajiBlobList())
        {
            PlayerGuaji playerGuaji = new PlayerGuaji();
            playerGuaji.fromBlob(each);
            playerGuajiList.add(playerGuaji);
        }
    }
    public List<PlayerGuaji> getPlayerGuajiList()
    {
        return playerGuajiList;
    }
}
