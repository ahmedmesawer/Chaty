package com.mesawer.chaty.chaty.add_friend;

import com.mesawer.chaty.chaty.base.IView;
import com.mesawer.chaty.chaty.data.User;

/**
 * Created by ilias on 11/03/2018.
 */

public interface AddFriendContract {

    interface View extends IView {
        void showUsers(User user);

        void changeAddFriendButtonText(User user);
    }

    interface Presenter {
        void getUsers(User current);

        void sendFriendRequest(User current, User userToSend);

        void cancelFriendRequest(User current, User userToCancel);
    }
}
