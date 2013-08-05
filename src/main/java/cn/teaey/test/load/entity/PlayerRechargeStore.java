package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerRechargeStore implements Blobable<Entity.PlayerRechargeStoreBlob>
{
    private List<PlayerRecharge> playerRechargeList = new ArrayList<>();
    @Override
    public Entity.PlayerRechargeStoreBlob toBlob()
    {
        Entity.PlayerRechargeStoreBlob.Builder blob = Entity.PlayerRechargeStoreBlob.newBuilder();
        for (PlayerRecharge each : playerRechargeList)
        {
            blob.addPlayerRechargeBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerRechargeStoreBlob playerRechargeStoreBlob)
    {
        for (Entity.PlayerRechargeBlob each : playerRechargeStoreBlob.getPlayerRechargeBlobList())
        {
            PlayerRecharge playerRecharge = new PlayerRecharge();
            playerRecharge.fromBlob(each);
            playerRechargeList.add(playerRecharge);
        }
    }
    public List<PlayerRecharge> getPlayerRechargeList()
    {
        return playerRechargeList;
    }
}
