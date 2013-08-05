package cn.teaey.test.load.entity;
import cn.teaey.fenrisulfr.orm.Blobable;

import java.util.ArrayList;
import java.util.List;
/**
 * User: Teaey
 * Date: 13-7-30
 */
public class PlayerFriendStore implements Blobable<Entity.PlayerFriendStoreBlob>
{
    private List<PlayerFriend> playerFriendList = new ArrayList<>();
    @Override
    public Entity.PlayerFriendStoreBlob toBlob()
    {
        Entity.PlayerFriendStoreBlob.Builder blob = Entity.PlayerFriendStoreBlob.newBuilder();
        for (PlayerFriend each : playerFriendList)
        {
            blob.addPlayerFriendBlob(each.toBlob());
        }
        return blob.build();
    }
    @Override
    public void fromBlob(Entity.PlayerFriendStoreBlob playerFriendStoreBlob)
    {
        for (Entity.PlayerFriendBlob each : playerFriendStoreBlob.getPlayerFriendBlobList())
        {
            PlayerFriend playerFriend = new PlayerFriend();
            playerFriend.fromBlob(each);
            playerFriendList.add(playerFriend);
        }
    }
    public List<PlayerFriend> getPlayerFriendList()
    {
        return playerFriendList;
    }
}
