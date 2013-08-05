package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerWuxingRaffleInfoStore implements Blobable<Entity.PlayerWuxingRaffleInfoStoreBlob>
{
    private List<PlayerWuxingRaffleInfo> playerWuxingRaffleInfoList = new ArrayList<>();
    @Override
    public Entity.PlayerWuxingRaffleInfoStoreBlob toBlob()
    {
        Entity.PlayerWuxingRaffleInfoStoreBlob.Builder blob = Entity.PlayerWuxingRaffleInfoStoreBlob.newBuilder();
        for (PlayerWuxingRaffleInfo each : playerWuxingRaffleInfoList)
        {
            blob.addPlayerWuxingRaffleInfoBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerWuxingRaffleInfoStoreBlob playerWuxingRaffleInfoStoreBlob)
    {
        for (Entity.PlayerWuxingRaffleInfoBlob each : playerWuxingRaffleInfoStoreBlob.getPlayerWuxingRaffleInfoBlobList())
        {
            PlayerWuxingRaffleInfo playerWuxingRaffleInfo = new PlayerWuxingRaffleInfo();
            playerWuxingRaffleInfo.fromBlob(each);
            playerWuxingRaffleInfoList.add(playerWuxingRaffleInfo);
        }
    }
    public List<PlayerWuxingRaffleInfo> getPlayerWuxingRaffleInfoList()
    {
        return playerWuxingRaffleInfoList;
    }
}
