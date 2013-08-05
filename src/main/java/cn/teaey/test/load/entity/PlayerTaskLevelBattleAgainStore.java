package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerTaskLevelBattleAgainStore implements Blobable<Entity.PlayerTaskLevelBattleAgainStoreBlob>
{
    private List<PlayerTaskLevelBattleAgain> playerTaskLevelBattleAgainList = new ArrayList<>();
    @Override
    public Entity.PlayerTaskLevelBattleAgainStoreBlob toBlob()
    {
        Entity.PlayerTaskLevelBattleAgainStoreBlob.Builder blob = Entity.PlayerTaskLevelBattleAgainStoreBlob.newBuilder();
        for (PlayerTaskLevelBattleAgain each : playerTaskLevelBattleAgainList)
        {
            blob.addPlayerTaskLevelBattleAgainBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerTaskLevelBattleAgainStoreBlob playerTaskLevelBattleAgainStoreBlob)
    {
        for (Entity.PlayerTaskLevelBattleAgainBlob each : playerTaskLevelBattleAgainStoreBlob.getPlayerTaskLevelBattleAgainBlobList())
        {
            PlayerTaskLevelBattleAgain playerTaskLevelBattleAgain = new PlayerTaskLevelBattleAgain();
            playerTaskLevelBattleAgain.fromBlob(each);
            playerTaskLevelBattleAgainList.add(playerTaskLevelBattleAgain);
        }
    }
    public List<PlayerTaskLevelBattleAgain> getPlayerTaskLevelBattleAgainList()
    {
        return playerTaskLevelBattleAgainList;
    }
}
